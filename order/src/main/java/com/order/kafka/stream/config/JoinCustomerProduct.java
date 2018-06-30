package com.order.kafka.stream.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.utils.Bytes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;
import org.apache.kafka.streams.kstream.Materialized;
import org.apache.kafka.streams.state.KeyValueStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;

import com.order.avro.domain.Product;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class JoinCustomerProduct {

	@Autowired
	private KafkaStreamProperties kafkaStreamProperties;
	
	static final String ALL_PRODUCTS = "allproduct";

	@Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
	public StreamsConfig kStreamsConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, kafkaStreamProperties.getGroup());
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaStreamProperties.getBootstrap());
		props.put(StreamsConfig.KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		props.put(StreamsConfig.VALUE_SERDE_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
		return new StreamsConfig(props);
	}

	
	
	@Bean
	public KStream<String, String> kStream(StreamsBuilder kStreamBuilder) {

				final KTable<Long, Product> songTable = kStreamBuilder.table(kafkaStreamProperties.getTopic(),
				Materialized.<Long, Product, KeyValueStore<Bytes, byte[]>>as(ALL_PRODUCTS));		
				songTable.toStream().to("allproduct-topic");
		
		return null;
	}
}
