package com.leansys.fr.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerConfiguration {
	private final static String TOPIC = "my-example-topic";
    private final static String BOOTSTRAP_SERVERS =
            "localhost:9092,localhost:9093,localhost:9094";
    
//@Bean - dzau denumirea la insasi clasa
	public void sendTopicFromProducer() { //numesc kafkaProducer
	Properties prop = new Properties();
	prop.put("bootstrap.servers", BOOTSTRAP_SERVERS);
	prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
	
	KafkaProducer<String, String> producer = new KafkaProducer<String, String>(prop);
	
	String k = "mykey";
	String v = "myValue";
	ProducerRecord<String, String> record = new ProducerRecord<String, String>(TOPIC, k, v); 
	producer.send(record);
	

	}
}









