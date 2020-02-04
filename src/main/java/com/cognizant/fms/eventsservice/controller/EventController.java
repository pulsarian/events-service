package com.cognizant.fms.eventsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.fms.eventsservice.entity.Event;
import com.cognizant.fms.eventsservice.repository.EventRepository;

import reactor.core.publisher.Flux;

@RestController
public class EventController {
	@Autowired
	private EventRepository eventRepository;
	
	@GetMapping("/events")
	public Flux<Event> getAllUsers() {
		return eventRepository.findAll();
	}
}
