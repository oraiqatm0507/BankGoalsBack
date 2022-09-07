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
	
	
	
	// TODO: Return a goal by goal owner ID
	@QueryMapping
	public Goal goalById(@Argument String id) {
		//return getBydId(id);
		return new Goal();
	}
	
	// TODO: Return a goal by goal ID
	
	
	
	// TODO: When user connects to login page for first time, get all of that user's goal info.
	
	
	// TODO: Add a new goal to DB
	
	@QueryMapping
	public Goal addGoal(@Argument String name) {
		Goal goal = new Goal(name, "Grab Lunch");
		return goalsRepo.addGoal(goal);
	}
	
	// TODO: Update an existing goals info with user defined changes. (name, amount, end goal amount etc.)
	
	
	// TODO: Delete goal by id
	
	
	// TODO: get estimated goal duration
}
