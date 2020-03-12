package com.devops.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.entity.DevMember;

@RestController
public class DevopsController {
	
	@RequestMapping("/")
    public List<DevMember> getDevMembers()
    {
      List<DevMember> memberList = new ArrayList<DevMember>();
      
      memberList.add(new DevMember("prem", "Developer"));
      memberList.add(new DevMember("Sahoo", "Tester"));
      
      return memberList;
    }
}
