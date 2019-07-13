package com.leansys.fr.consumer;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.fasterxml.jackson.databind.deser.std.StringDeserializer;

public class ConsumerConfiguration {

	public void receiveSentMessagesByProducer() {
		Properties propConsumer = new Properties();
		propConsumer.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		propConsumer.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id_example");
		propConsumer.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		propConsumer.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		
		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(propConsumer);
		
		consumer.subscribe(Arrays.asList("my-example-topic"));
	}
}
