/**
 * This file created at 2019年4月9日.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package main.requirement.pck;

/**
 * <code>{@link RequirementOne}</code> 
 * 
 * @author kinghuang
 */
public class RequirementOne {

	/*
	 * 写一个程序，打印从1到100的数字， 然后按照特定的规律输： 3的倍数用“Fizz”代替， 5的倍数用“Buzz”代替，
	 * 3和5的倍数用“FizzBuzz"代替
	 */
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			i++;
		}
	}
}
