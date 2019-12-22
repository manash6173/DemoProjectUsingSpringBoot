package com.manash.demo.controller;

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.manash.demo.service.WishService;

@Controller
public class WishController {
	
	@Autowired
	private WishService service;
	
	@RequestMapping("/")
	public  String getHome() {
		System.out.println("-----------");
		return "wish";
	}
	
	@GetMapping("/wish")
	public String getWishMsg(@PathParam("name") String name,Map<String,String> map) {
		String msg=null;
		if(name!=null && !name.isEmpty()) {
		msg=service.getWish();
		map.put("msg","<marquee>Hii "+name+" <<<<<----->>>> "+msg+"</marquee>");
		}
		else {
			map.put("msg","Please Enter Your Name!!!!!!");
		}
		return "wish";
	}

}
