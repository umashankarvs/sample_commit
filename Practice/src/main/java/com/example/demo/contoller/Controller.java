package com.example.demo.contoller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping(value="/get")
	@RestResource
	public Map<String,String> getValue(){
		Map<String,String> map = new HashMap<>();
		map.put("welcome","welcoem");
		return map;
	}
	
	@RequestMapping(value="/getValue")
	@RestResource
	public String getV(){
		return "welcome to spring";
	}
}
