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
	
	
	@QueryMapping
	public Goal addGoal(@Argument GoalInfo goalInfo) {
		
		Goal newGoal = new Goal(goalInfo);
		System.out.println(goalInfo.getName());
		return goalsRepo.addGoal(newGoal);
		
	}
	
	
	@QueryMapping
	public Goal goalById(@Argument long id) {
		return goalsRepo.getGoalById(id);
	
	}
	
	
	@QueryMapping
	public List<Goal> getGoalsByOwner(@Argument String ownerId){
		return goalsRepo.getGoalsByOwnerId(ownerId);
	}
	
	
	
	
	
	// TODO: When user connects to login page for first time, get all of that user's goal info.
	
	
	
	
	// TODO: Update an existing goals info with user defined changes. (name, amount, end goal amount etc.)
	
	
	// TODO: Delete goal by id
	
	
	// TODO: get estimated goal duration
}
