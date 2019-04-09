/**
 * This file created at 2019Äê4ÔÂ9ÈÕ.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package main.model;

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

	public void teachLesson(Student[] students) {
		int i =1;
		for(Student student:students){
			student = new Student();
			student.playGames(i);
			System.out.println(student.getSay());
			i++;
		}
	}
}
