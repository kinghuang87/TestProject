/**
 * This file created at 2019年4月9日.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package miniCoding.testProject.maven01.model;

/**
 * <code>{@link Student}</code>
 *
 * TODO : document me
 *
 * @author kinghuang
 */
public class Student {
	
	//年龄
	private int age;
	//说
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

	/**
	 * 学生玩游戏 
	 * @param sayNum
	 */
	public void playGames(int sayNum){
		//当学生报数到3的倍数和5的倍数的时候，这个同学要说FizzBuzz
		if(sayNum%3== 0 && sayNum%5 ==0){
			setSay("FizzBuzz");
		//当学生报数数到3的倍数，这个同学要说Fizz
		}else if(sayNum%3 == 0){
			setSay("Fizz");
		//当学生报数数到5的倍数，这个同学要说Buzz
		}else if(sayNum%5 == 0){
			setSay("Buzz");
		//不符合上面三个条件的报数的同学就直接报数字
		}else{
			setSay(String.valueOf(sayNum));
		}
	}
}
