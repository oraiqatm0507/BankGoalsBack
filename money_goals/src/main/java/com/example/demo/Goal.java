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
	
	//These do not need to be private as they are outputs but still recommeneded to be private
	//with getters and setters.
	
	private String name;
	private String goalMsg;
	
	private String goalOwner;
	private String startDate;
	private String endDate;
	private float startingInstallment;
	private float currentBalance;
	private float goalBalance;
	private String reminderBuffer;
	private String goalColor;
	private String estimatedDurationOfGoal;
	private String preferredGoalDuration;
	private float aquiredAmount;
	private GoalType goalType;
	private AccountType accountType;
	private boolean isCompleted;
	private String recipientId;
	
	
	//Constructors
	public Goal() {
		
	}
	
	public Goal(String name,String goalMsg ) {
		this.setName(name);
		this.setGoalMsg(goalMsg);
	}
	
	
	public Goal(GoalInfo goalInfo) {
		this.setName(goalInfo.getName());
		this.setGoalMsg(goalInfo.getGoalMsg());
		this.setGoalOwner(goalInfo.getGoalOwner());
		this.setStartDate(goalInfo.getStartDate());
		this.setEndDate(goalInfo.getEndDate());
		this.setStartingInstallment(goalInfo.getStartingInstallment());
		this.setCurrentBalance(goalInfo.getCurrentBalance());
		this.setGoalBalance(goalInfo.getGoalBalance());
		this.setReminderBuffer(goalInfo.getReminderBuffer());
		this.setGoalColor(goalInfo.getGoalColor());
		this.setEstimatedDurationOfGoal(goalInfo.getEstimatedDurationOfGoal());
		this.setAquiredAmount(goalInfo.getAquiredAmount());
		this.setGoalType(goalInfo.getGoalType());
		this.setAccountType(goalInfo.getAccountType());
		this.setCompleted(goalInfo.isCompleted());
		this.setRecipientId(goalInfo.getRecipientId());
	}

	//Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGoalMsg() {
		return goalMsg;
	}

	public void setGoalMsg(String goalMsg) {
		this.goalMsg = goalMsg;
	}

	public String getGoalOwner() {
		return goalOwner;
	}

	public void setGoalOwner(String goalOwner) {
		this.goalOwner = goalOwner;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public float getStartingInstallment() {
		return startingInstallment;
	}

	public void setStartingInstallment(float startingInstallment) {
		this.startingInstallment = startingInstallment;
	}

	public float getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(float currentBalance) {
		this.currentBalance = currentBalance;
	}

	public float getGoalBalance() {
		return goalBalance;
	}

	public void setGoalBalance(float goalBalance) {
		this.goalBalance = goalBalance;
	}

	public String getReminderBuffer() {
		return reminderBuffer;
	}

	public void setReminderBuffer(String reminderBuffer) {
		this.reminderBuffer = reminderBuffer;
	}

	public String getGoalColor() {
		return goalColor;
	}

	public void setGoalColor(String goalColor) {
		this.goalColor = goalColor;
	}

	public String getEstimatedDurationOfGoal() {
		return estimatedDurationOfGoal;
	}

	public void setEstimatedDurationOfGoal(String estimatedDurationOfGoal) {
		this.estimatedDurationOfGoal = estimatedDurationOfGoal;
	}

	public String getPreferredGoalDuration() {
		return preferredGoalDuration;
	}

	public void setPreferredGoalDuration(String preferredGoalDuration) {
		this.preferredGoalDuration = preferredGoalDuration;
	}

	public GoalType getGoalType() {
		return goalType;
	}

	public void setGoalType(GoalType goalType) {
		this.goalType = goalType;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public boolean isCompleted() {
		return isCompleted;
	}

	public void setCompleted(boolean isCompleted) {
		this.isCompleted = isCompleted;
	}

	public float getAquiredAmount() {
		return aquiredAmount;
	}

	public void setAquiredAmount(float aquiredAmount) {
		this.aquiredAmount = aquiredAmount;
	}

	public String getRecipientId() {
		return recipientId;
	}

	public void setRecipientId(String recipientId) {
		this.recipientId = recipientId;
	}

	
	
}
