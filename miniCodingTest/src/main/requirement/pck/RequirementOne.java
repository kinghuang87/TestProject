/**
 * This file created at 2019��4��9��.
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
	 * дһ�����򣬴�ӡ��1��100�����֣� Ȼ�����ض��Ĺ����䣺 3�ı����á�Fizz�����棬 5�ı����á�Buzz�����棬
	 * 3��5�ı����á�FizzBuzz"����
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
