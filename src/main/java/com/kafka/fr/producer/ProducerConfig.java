package com.kafka.fr.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

public class ProducerConfig {
	private final static String TOPIC = "my-example-topic";
	private final static String BOOTSTRAP_SERVERS = "localhost:9092,localhost:9093,localhost:9094";

	public void sendRecordFromProducer() {
		String k = "mykey";
		String v = "myValue";
		Properties prop = new Properties();
		prop.put("bootstrap.servers", BOOTSTRAP_SERVERS);
		prop.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		prop.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

		KafkaProducer<String, String> producer = new KafkaProducer<String, String>(prop);

		ProducerRecord<String, String> record = new ProducerRecord<String, String>(TOPIC, k, v);
		producer.send(record);

	}
}
