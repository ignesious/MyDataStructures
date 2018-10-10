package com.momo.spring;

public class HappyFortuneService implements FortuneService {

	 public HappyFortuneService() {
		// TODO Auto-generated constructor stub
	System.out.println("happy fortune constructing");
	 }
	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Today is your good fortune";
	}

}
