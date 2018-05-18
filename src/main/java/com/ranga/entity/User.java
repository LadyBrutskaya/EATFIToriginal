package com.ranga.entity;
// Generated 15.05.2018 1:29:21 by Hibernate Tools 5.1.7.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class User implements java.io.Serializable {

	private Long id;
	private Roles roles;
	private Statuses statuses;
	private String login;
	private String password;
	private String name;
	private Byte gender;
	private Date birthdate;
	private Float weight;
	private Float height;
	private String goal;
	private String activity;
	private Date created;
	private Date updated;
	private Set mealses = new HashSet(0);

	public User() {
	}

	public User(Roles roles, Statuses statuses, String login, String password, Date created) {
		this.roles = roles;
		this.statuses = statuses;
		this.login = login;
		this.password = password;
		this.created = created;
	}

	public User(Roles roles, Statuses statuses, String login, String password, String name, Byte gender, Date birthdate,
			Float weight, Float height, String goal, String activity, Date created, Date updated, Set mealses) {
		this.roles = roles;
		this.statuses = statuses;
		this.login = login;
		this.password = password;
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
		this.weight = weight;
		this.height = height;
		this.goal = goal;
		this.activity = activity;
		this.created = created;
		this.updated = updated;
		this.mealses = mealses;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Roles getRoles() {
		return this.roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	public Statuses getStatuses() {
		return this.statuses;
	}

	public void setStatuses(Statuses statuses) {
		this.statuses = statuses;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Byte getGender() {
		return this.gender;
	}

	public void setGender(Byte gender) {
		this.gender = gender;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getHeight() {
		return this.height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public String getGoal() {
		return this.goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getUpdated() {
		return this.updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public Set getMealses() {
		return this.mealses;
	}

	public void setMealses(Set mealses) {
		this.mealses = mealses;
	}

}
