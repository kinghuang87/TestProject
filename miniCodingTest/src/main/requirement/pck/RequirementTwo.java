/**
 * This file created at 2019年4月9日.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package main.requirement.pck;

/**
 * <code>{@link RequirementTwo}</code> 
 * 
 * @author kinghuang
 */
public class RequirementTwo {

	/*
	 * 1数字Fizz是否 可以被3整除或者含有数字3
	 * 2数字Buzz是否 可以被5整除或者含有数字5
	 * 3数字“FizzBuzz"包含1、2条件
	 * */
	public static void main(String[] args) {
		int i = 1;
		while(i<=100){
			if((i%3==0 || String.valueOf(i).contains("3")) && (i%5==0 || String.valueOf(i).contains("5"))){
				System.out.println("FizzBuzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else if(i%5==0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
			i++;
		}
	}
}
