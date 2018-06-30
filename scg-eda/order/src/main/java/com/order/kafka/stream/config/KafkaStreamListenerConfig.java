package com.order.kafka.stream.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.state.KeyValueStore;
import org.apache.kafka.streams.state.StoreBuilder;
import org.apache.kafka.streams.state.Stores;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;
import org.springframework.kafka.annotation.KafkaStreamsDefaultConfiguration;

import com.order.avro.domain.Order;
import com.order.kafka.serializer.AvroSerializer;

import io.confluent.kafka.serializers.KafkaAvroSerializer;

@Configuration
@EnableKafka
@EnableKafkaStreams
public class KafkaStreamListenerConfig {

	@Autowired
	private KafkaStreamProperties kafkaStreamProperties;

	@Bean(name = KafkaStreamsDefaultConfiguration.DEFAULT_STREAMS_CONFIG_BEAN_NAME)
	public StreamsConfig kStreamsConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put(StreamsConfig.APPLICATION_ID_CONFIG, kafkaStreamProperties.getGroup());
		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaStreamProperties.getBootstrap());
		//props.put(StreamsConfig.KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		props.put(StreamsConfig.VALUE_SERDE_CLASS_CONFIG, KafkaAvroSerializer.class.getName());
		return new StreamsConfig(props);
	}
	
	
	@Bean
    public Serializer<Order> orderJsonSerializer() {
        return new AvroSerializer<Order>();
    }
	
	
	 @Bean
	 public KStream<String, Order> kStream(StreamsBuilder kStreamBuilder) {
		 
		 
		 KStream<String,Order> orderKStream = kStreamBuilder.stream("src-topic");		 
		 orderKStream.mapValues(p-> Order.newBuilder());
		 
		
		 
		 
		 
		 StoreBuilder<KeyValueStore<String, Long>> countStoreSupplier =Stores.keyValueStoreBuilder(
				    Stores.inMemoryKeyValueStore("inmemory-counts"),
				    Serdes.String(),
				    Serdes.Long());
		 
		kStreamBuilder.addStateStore(countStoreSupplier);
		
		 /**/
		 
		 
		
		/* KStream<String, Order> textLines = kStreamBuilder.stream(

		 KStream<String, Order> wordCounts=null;
		 wordCounts.print();*/
	     return null;
	 }
}
