/**
 * This file created at 2019Äê4ÔÂ9ÈÕ.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package main.unit.test.pck;

import static org.junit.Assert.*;
import main.model.Student;
import main.model.Teacher;

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
		teacher.setStudents(new Student[33]);
		assertNotNull(teacher.getStudents());
	    teacher.teachLesson(teacher.getStudents()); 
	}
}
