/**
 * This file created at 2019年4月9日.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package miniCoding.testProject.maven01;

/**
 * <code>{@link RequirementProgram}</code> 
 * 
 * @author kinghuang
 */
public class RequirementProgram {

	/*
	 * 写一个程序，打印从1到100的数字， 然后按照特定的规律输： 3的倍数用“Fizz”代替， 5的倍数用“Buzz”代替，
	 * 3和5的倍数用“FizzBuzz"代替
	 */
	public String requirementOne() {
		String result = "success";
		try {
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
		} catch (Exception e) {
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
	
	/*
	 * 1 数字Fizz是否 可以被3整除或者含有数字3
	 * 2 数字Buzz是否 可以被5整除或者含有数字5
	 * 3 数字“FizzBuzz"包含1、2条件
	 * */
	public String requirementTwo(){
		String result = "success";
		try {
			int i = 1;
			while(i<=100){
				if((i%3==0 || String.valueOf(i).contains("3")) && (i%5==0 || String.valueOf(i).contains("5"))){
					System.out.println("FizzBuzz");
				}else if(i%3==0 || String.valueOf(i).contains("3")){
					System.out.println("Fizz");
				}else if(i%5==0 || String.valueOf(i).contains("5")){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = e.getMessage();
		}
		return result;
	}
}
