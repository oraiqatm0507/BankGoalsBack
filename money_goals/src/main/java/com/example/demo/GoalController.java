package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GoalController {
	
	
	@Autowired
	GoalsRepo goalsRepo;
	
	
	
	
	//Simple Authentication
	@QueryMapping
	public boolean MG_createAccount(@Argument G_UserInfo userInfo) {
		return goalsRepo.createAccount(userInfo);
		
	}
	
	@QueryMapping
	public G_User MG_loginUser(@Argument G_UserInfo userInfo) {
		return goalsRepo.loginUser(userInfo);
	}
	
	
	
	
	@QueryMapping
	public Goal MG_addGoal(@Argument GoalInfo goalInfo) {
		
		Goal newGoal = new Goal(goalInfo);
		System.out.println(goalInfo.getName());
		return goalsRepo.addGoal(newGoal);
		
	}
	
	
	@QueryMapping
	public Goal MG_goalById(@Argument long id) {
		return goalsRepo.getGoalById(id);
	
	}
	
	
	@QueryMapping
	public List<Goal> MG_getGoalsByOwner(@Argument String ownerId){
		return goalsRepo.getGoalsByOwnerId(ownerId);
	}
	
	
	
	@QueryMapping
	public boolean MG_updateGoalById(@Argument long id ,@Argument GoalInfo goalInfo) {
		return goalsRepo.updateGoal(id, goalInfo);
	}
	
	
	@QueryMapping
	public boolean MG_deleteGoalById(@Argument long id) {
		return goalsRepo.deleteGoal(id);
		
	}

	
	@QueryMapping
	public String MG_getEstimatedGoalDuration(@Argument long id) {
		return goalsRepo.estimateGoalDuration(id);
	}
	
	
}
