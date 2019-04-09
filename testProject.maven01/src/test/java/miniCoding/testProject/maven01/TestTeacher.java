/**
 * This file created at 2019年4月9日.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package miniCoding.testProject.maven01;

import static org.junit.Assert.*;
import miniCoding.testProject.maven01.model.Student;
import miniCoding.testProject.maven01.model.Teacher;

import org.junit.After;
import org.junit.Test;

/**
 * <code>{@link TestTeacher}</code>
 *
 * @author kinghuang
 */
public class TestTeacher {

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Teacher teacher = new Teacher();
		assertNotNull(teacher);
		//初始化33个学生
		Student[] students = new Student[33];
		for(int i =0;i<33;i++){
			Student student = new Student();
			student.setAge(11);
			students[i] = student;
		}
		teacher.setStudents(students);
		assertNotNull(teacher.getStudents());
	    teacher.teachLesson(teacher.getStudents()); 
	}
}
