package com.cognizant.fms.eventsservice.model;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class  AuthRequest {
	private String username;
	private String password;
}