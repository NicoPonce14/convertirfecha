package com.nicolas.convertirfecha.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller

public class MainController {

	@RequestMapping("/")
	public String bienvenida() {
		System.out.println("index");
		return "index.jsp";
	}
	
	@RequestMapping("/date")
	public String date(Model model) {
		System.out.println("date");
		SimpleDateFormat f = new SimpleDateFormat("EEEE, MMMM d, yyyy ");
		
		
		Date date = new Date();
		model.addAttribute("date",f.format(date));
		return "date.jsp";
	}
	
	@GetMapping("/time")
	public String time(Model model) {
		System.out.println("time");
		SimpleDateFormat f = new SimpleDateFormat("h:mm a");
		Date date = new Date();
		model.addAttribute("date",f.format(date));
		return "time.jsp";
	}
}
