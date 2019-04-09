/**
 * This file created at 2019年4月9日.
 *
 * Copyright (c) 2002-2019 Bingosoft, Inc. All rights reserved.
 */
package miniCoding.testProject.maven01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

/**
 * <code>{@link TestRequirementprogram}</code>
 *
 * TODO : document me
 *
 * @author Lenovo
 */
public class TestRequirementprogram {

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}
	
	RequirementProgram program = new RequirementProgram();

	/**
	 * Test method for {@link miniCoding.maven01.RequirementProgram#requirementOne()}.
	 */
	@Test
	public void testRequirementOne() {
		String result = program.requirementOne();
		assertEquals("success", result);
	}

	/**
	 * Test method for {@link miniCoding.maven01.RequirementProgram#requirementTwo()}.
	 */
	@Test
	public void testRequirementTwo() {
		String result = program.requirementTwo();
		assertEquals("success", result);
	}

}
