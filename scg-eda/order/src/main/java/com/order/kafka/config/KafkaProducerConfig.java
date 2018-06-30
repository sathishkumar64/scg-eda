package com.order.kafka.config;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.order.avro.domain.Order;
import com.order.kafka.serializer.AvroSerializer;


@Configuration
public class KafkaProducerConfig {

	@Autowired
	private KafkaProducerProperties kafkaProducerProperties;

	@Bean
	public Map<String, Object> producerConfigs() {
		Map<String, Object> props = new HashMap<>();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, kafkaProducerProperties.getBootstrap());
		props.put(ProducerConfig.ACKS_CONFIG, "all");
		//props.put(ProducerConfig.ENABLE_IDEMPOTENCE_CONFIG, String.valueOf(kafkaProducerProperties.enableIdempotence));
		props.put(ProducerConfig.TRANSACTIONAL_ID_CONFIG, UUID.randomUUID().toString());
		return props;
	}


	@Bean
    public KafkaProducer<String, Order> orderProducer() {      
        KafkaProducer<String, Order> producer = new KafkaProducer<>(producerConfigs(), stringKeySerializer(), orderJsonSerializer());
        return producer;
    }
			
	@Bean
    public Serializer<String> stringKeySerializer() {
        return new StringSerializer();
    }

	@Bean
    public Serializer<Order> orderJsonSerializer() {
        return new AvroSerializer<Order>();
    }
}
