package com.kafka.fr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.fr.producer.ProducerConfig;

@RestController
@RequestMapping(value="/exercice")
public class Controller {

	ProducerConfig producer; 
	
	@GetMapping(value = "/kafka")
	public String sendMessage () {
		producer.sendRecordFromProducer();
		return "message envoyé";
	}
	
}
