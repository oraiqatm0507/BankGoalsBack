package com.example.demo;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("goalsRepo")
public class GoalsRepo {
	
	@Autowired 
	G_UserRepository userRepo;
	
	@Autowired
	GoalsRepository goalsDB;
	
	
	
	
	
	
	
	public boolean createAccount(G_UserInfo userInfo) {
		G_User user = new G_User(userInfo);
		
		if(userRepo.findByEmail(userInfo.getEmail()) != null ) {
			return false;
		}
		userRepo.save(user);
		return true;
	}
	
	public String loginUser(G_UserInfo userInfo) {
		G_User tempUser = userRepo.findByEmail(userInfo.getEmail());
		System.out.println(tempUser.getId());
		if(!tempUser.getPassword().equals(userInfo.getPassword())) {
			return null;
		}	
		String id = String.valueOf(tempUser.getId());
		
		return id;
		
		
	}
	
	
	public Goal addGoal(Goal goal) {
		return goalsDB.save(goal);
	}
	
	public Goal getGoalById(long id) {
		
		return goalsDB.findById(id).get();
	}
	
	public List<Goal> getGoalsByOwnerId(String ownerId){
		return goalsDB.findByGoalOwner(ownerId);
	}
	
	public boolean updateGoal( long id ,GoalInfo goalInfo) {
		Goal goal = goalsDB.findById(id).get();
		goal.copyGoalInfo(goalInfo);
		goalsDB.save(goal);
		return true;
		
	}
	
	public boolean deleteGoal(long id) {
		goalsDB.deleteById(id);
		return true;
	}
	
	
	public String estimateGoalDuration(long id) {
		Goal goal = goalsDB.findById(id).get();
		float rate = goal.getStartingInstallment();
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

		
		try {
			Date startDate = formatter.parse(goal.getStartDate());
			Date endDate = formatter.parse(goal.getEndDate());
			
			long days = ChronoUnit.DAYS.between(startDate.toInstant(),endDate.toInstant());
			
			return "I can't think right now";
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "I can't think right now";
		}
	}
	
	
}
