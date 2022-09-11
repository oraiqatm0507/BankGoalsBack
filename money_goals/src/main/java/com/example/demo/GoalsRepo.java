package com.example.demo;

import java.util.List;

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
	
	
	
}
