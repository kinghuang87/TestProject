/**
 * This file created at 2019年4月9日.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package miniCoding.testProject.maven01.model;

/**
 * <code>{@link Teacher}</code>
 * 
 * @author kinghuang
 */
public class Teacher {
	
	private Student[] students;
	
	/**
	 * @return the student
	 */
	public Student[] getStudents() {
		return students;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudents(Student[] students) {
		this.students = students;
	}

	/**
	 * 老师给学生上课
	 * @param students
	 */
	public void teachLesson(Student[] students) {
		int i =1;
		for(Student student:students){
			//带学生们一起玩游戏
			student.playGames(i);
			System.out.println(student.getSay());
			i++;
		}
	}
}
