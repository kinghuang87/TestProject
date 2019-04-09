/**
 * This file created at 2019Äê4ÔÂ9ÈÕ.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package main.model;

/**
 * <code>{@link Student}</code>
 *
 * TODO : document me
 *
 * @author kinghuang
 */
public class Student {
	
	private int age;
	
	private String say;
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * @return the say
	 */
	public String getSay() {
		return say;
	}

	/**
	 * @param say the say to set
	 */
	public void setSay(String say) {
		this.say = say;
	}


	public void playGames(int sayNum){
		if(sayNum%3== 0 && sayNum%5 ==0){
			setSay("FizzBuzz");
		}else if(sayNum%3 == 0){
			setSay("Fizz");
		}else if(sayNum%5 == 0){
			setSay("Buzz");
		}else{
			setSay(String.valueOf(sayNum));
		}
	}
}
