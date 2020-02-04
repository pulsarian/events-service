package com.cognizant.fms.eventsservice.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table("event")
public class Event {
	
	@Id
	@Column("event_id")
	private String eventId;
	@Column("event_name")
	private String eventName;
	@Column("event_desc")
	private String eventDescription;
	@Column("event_date")
	private Date eventDate;
	@Column("event_loc")
	private String baseLocation;
	@Column("event_beneficiary")
	private String beneficiaryName;
	@Column("event_council")
	private String councilName;
	@Column("event_lives_impacted")
	private Integer livesImpacted;
	@Column("event_status")
	private String status;
	@Column("event_iiep_category")
	private String iiepCategory;
	@Column("event_project")
	private String project;
	@Column("event_month")
	private String month;
	@Column("event_address")
	private String address;
	@Column("event_category")
	private String category;
	@Column("event_volunteers")
	private String totalVolunteers;
	@Column("event_volunteer_hours")
	private Float volunteerHours;
	@Column("event_travel_hours")
	private Float travelHours;
	@Column("event_overall_volunteer_hours")
	private Double overallVolunteeringHours;
	@Column("event_activity_type")
	private String activityType;
	@Column("event_city")
	private String city;
	@Column("event_country")
	private String country;

}