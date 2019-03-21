package com.example.demo.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.User;

//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.FileReadRepository;

@Controller
public class ReadController {

	@Autowired
	FileReadRepository repo;
	
	@RequestMapping("/users")
    @ResponseBody
	public List<User> getUser()
	{
		return repo.findAll();
	}
	
}
