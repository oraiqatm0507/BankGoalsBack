package com.example.demo;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.graphql.data.method.annotation.SchemaMapping;

@Entity
public class Goal {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long id;	
	
	
	private String name;
	private String goalMsg;
	
	private String goalOwner;
	private String startDate;
	private String endDate;
	private float currentBalance;
	private float goalBalance;
	private String reminderBuffer;
	private String goalColor;
	private String estimatedDurationOfGoal;
	private String preferredGoalDuration;
	private GoalType goalType;
	private AccountType accountType;
	private boolean isCompleted;
	
	
	
	
	public Goal() {
		
	}
	
	public Goal(String name,String goalMsg ) {
		this.name = name;
		this.goalMsg = goalMsg;
	}
	
	
}
