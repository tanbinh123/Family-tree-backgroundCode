package com.orange.familyTree.entity;

import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@NodeEntity(label="Person")
public class Person{
	
	//有参构造器
	public Person(String name, String birthTime, String deathTime,
			String majorAchievements) {
		super();
		this.name = name;
		this.birthTime = birthTime;
		this.deathTime = deathTime;
		this.majorAchievements = majorAchievements;
	}

	//无参构造器
	public Person() {
	}

	
	//以下为节点属性
	@Id @GeneratedValue
	private Long uuid;

	@Property(name = "name")
	private String name;
	
	@Property(name = "firstName")
	private String firstName;
	
	@Property(name = "birthTime")
	private String birthTime;
	
	@Property(name = "deathTime")
	private String deathTime;
	
	@Property(name = "majorAchievements")
	private String majorAchievements;


	//该节点的父亲
	@JsonIgnoreProperties
	@Relationship(type = "IS_FARTHER", direction = Relationship.INCOMING)
	private Person farther;
	
	//该节点的儿子
	@JsonIgnoreProperties
	@Relationship(type = "IS_SON", direction = Relationship.INCOMING)
	private List<Person> sons;

	//该节点的兄弟
	@JsonIgnoreProperties
	@Relationship(type = "IS_BROTHER", direction = Relationship.OUTGOING)
	private List<Person> brothers;

	
	//以下为一系列get、set操作。
	public Long getUuid() {
		return uuid;
	}
	
	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setBirthTime(String birthTime) {
		this.birthTime = birthTime;
	}
	
	public String getBirthTime() {
		return this.birthTime;
	}
	
	public void setDeathTime(String deathTime) {
		this.deathTime = deathTime;
	}
	
	public String getDeathTime() {
		return this.deathTime;
	}
	
	public void setMajorAchievements(String majorAchievements) {
		this.majorAchievements = majorAchievements;
	}
	
	public String getMajorAchievements() {
		return this.majorAchievements;
	}

	public Person getFarther() {
		return farther;
	}
	
	public void setFarther(Person farther) {
		this.farther = farther;
	}
	
	public List<Person> getSons() {
		return sons;
	}
	
	public void setSons(List<Person> sons) {
		this.sons = sons;
	}

	public List<Person> getBrothers() {
		return brothers;
	}

	public void setBrothers(List<Person> brothers) {
		this.brothers = brothers;
	}

}
