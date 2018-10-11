package com.momo.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortune implements FortuneService {

	List<String> fortuneList = new ArrayList<String>();

	public RandomFortune() {
		// TODO Auto-generated constructor stub
		fortuneList.add("Today is your lucky day");
		fortuneList.add("Today is your fuxking day");
		fortuneList.add("Today will be same as yesterday");
		fortuneList.add("Today your wife will fuxk you up");
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int toGet = rand.nextInt() % 3;
		try {
			String temp = fortuneList.get(toGet);
			return temp;
		} catch (Exception e) {
			return "Today is your exception day";
		}
		
	}

}
