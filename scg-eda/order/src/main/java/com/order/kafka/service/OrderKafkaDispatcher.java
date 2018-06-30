package com.order.kafka.service;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.avro.domain.Order;
import com.order.kafka.config.KafkaProducerProperties;

@Service
public class OrderKafkaDispatcher {

	@Autowired
	private KafkaProducer<String, Order> orderProducer;

	@Autowired
	private KafkaProducerProperties kafkaProducerProperties;
	
	
	// private static final Logger LOGGER = LoggerFactory.getLogger(OrderKafkaDispatcher.class);

	    public boolean dispatch(Order order) {	    	
	        ProducerRecord<String, Order> record = new ProducerRecord<>(kafkaProducerProperties.getTopic(), order.getId(), order);
	        try {
	            RecordMetadata recordMetadata = this.orderProducer.send(record).get();
	          //  LOGGER.info("topic = {}, partition = {}, offset = {}, workUnit = {}",recordMetadata.topic(), recordMetadata.partition(), recordMetadata.offset(), order);
	            return true;
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }
}



