package com.cognizant.fms.eventsservice.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.fms.eventsservice.entity.Event;

@Repository
public interface EventRepository extends ReactiveCrudRepository<Event, String> {

}
