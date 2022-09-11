package com.example.demo;

import org.springframework.graphql.data.method.annotation.SchemaMapping;

@SchemaMapping
public class GoalInfo {
	
	//These variables must be private in order to work correctly since GoalInfo is an input within
	//Graphql Schema.
	
	private String id;
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
	
	
	//Getters and Setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
