package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.User;
import com.example.demo.repository.FileReadRepository;

@Service
@Transactional
public class ServiceImple implements ReadFileService
{
   @Autowired private FileReadRepository fileReadRepository;

@Override
public List<User> findAll() {
	// TODO Auto-generated method stub
	return (List<User>) fileReadRepository.findAll();
}




   
      
   
}
