package com.example.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.Ticket;
import com.example.Entity.User;
import com.example.Repository.TicketRepo;
import com.example.Repository.UserRepo;


@Service
public class UserService {
	
	@Autowired
	private UserRepo Repo;

	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.Repo.save(user);
	}

	public User getById(Long id) {
		// TODO Auto-generated method stub
		return  this.Repo.findById(id).get();
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.Repo.findAll();
	}

}
