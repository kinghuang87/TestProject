/**
 * This file created at 2019��4��9��.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package main.unit.test.pck;

import static org.junit.Assert.*;
import main.model.Student;

import org.junit.Test;

/**
 * <code>{@link TestStudent}</code>
 * @author kinghuang
 */
public class TestStudent {

	@Test
	public void test() {
		Student stu = new Student();
	    stu.playGames(5);
		System.out.println("ѧ��˵��"+stu.getSay());
		assertEquals("Buzz", stu.getSay());
	}
}
