package com.manash.demo.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

@Service("wishService")
public class WishServiceImpl implements WishService{

	@Override
	public String getWish() {
		Calendar cal=null;
		cal=Calendar.getInstance();
		int hour=cal.get(Calendar.HOUR_OF_DAY);
		if(hour<=12) {
			return "Good Morning";
		}
		else if(hour>12 && hour<=16) {
			return "Good AfterNoon";
		}
		else if(hour>16 && hour<=20) {
			return "Good Evening";
		}
		else {
			return "Good Night";
		}		
	}
	

}
