/**
 * This file created at 2019��4��9��.
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
	 * 1����Fizz�Ƿ� ���Ա�3�������ߺ�������3
	 * 2����Buzz�Ƿ� ���Ա�5�������ߺ�������5
	 * 3���֡�FizzBuzz"����1��2����
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
