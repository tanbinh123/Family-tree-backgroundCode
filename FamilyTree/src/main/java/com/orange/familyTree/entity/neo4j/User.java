package com.orange.familyTree.entity.neo4j;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


@NodeEntity(label="User")
public class User {

	public User() {}

	public User(Long uuid, Long userId) {
		this.uuid = uuid;
		this.userId = userId;
	}

	@Id @GeneratedValue
	private Long uuid;
	
	@Property(name="userId")
	private Long userId;

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
