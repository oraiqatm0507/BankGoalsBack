package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component("userRepo")
public interface G_UserRepository extends JpaRepository <G_User, String> {
	G_User findByEmail(String email);
}
