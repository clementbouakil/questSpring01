package com.wildcodeschool.questSpring01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class QuestSpring01Application {

	public static void main(String[] args) {
		SpringApplication.run(QuestSpring01Application.class, args);
	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String doctorOne() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String doctorTwo() {
		return "Patrick Troughton";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String doctorThree() {
    	return "Jon Pertwee";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String doctorFour() {
    	return "Tom Baker";
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul><li><a href='/doctor/1'>Tom Baker</a></li><li><a href='/doctor/2'>Jon Pertwee</a></li><li><a href='/doctor/3'>Patrick Troughton</a></li><li><a href='/doctor/4'>William Hartnell</a></li></ul>";
	}


	


}
