package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("goalsRepo")
public class GoalsRepo {
	
	@Autowired
	GoalsRepository goalsDB;
	
	public Goal addGoal(Goal goal) {
		return goalsDB.save(goal);
	}
	
	public Goal getGoalById(long id) {
		return goalsDB.findById(id).get();
	}
	
}
