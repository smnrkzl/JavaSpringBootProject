package com.hoaxify.ws.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class StudNotif {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany
	private Notifications notifications;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Notifications getNotifications() {
		return notifications;
	}

	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}

}
