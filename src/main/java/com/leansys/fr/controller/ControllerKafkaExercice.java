package com.leansys.fr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leansys.fr.producer.ProducerConfiguration;

@RestController
@RequestMapping(value="/exercice")
public class ControllerKafkaExercice {

	ProducerConfiguration producer; 
	
	@GetMapping(value = "/kafka")
	public String sendMessage () {
		producer.sendTopicFromProducer();
		return "message envoyé";
	}
	
}
