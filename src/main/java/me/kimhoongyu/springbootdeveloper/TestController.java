package me.kimhoongyu.springbootdeveloper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

	@Autowired
	TestService testService;
	
	@GetMapping("/test")
	public List<Member> getAllMembers(){
		List<Member> members = testService.getAllMembers();
		return members;
	}
}
