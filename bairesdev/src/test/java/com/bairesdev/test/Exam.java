package com.bairesdev.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exam
{

	private static Logger logger = LoggerFactory.getLogger(Exam.class);

	@Test
	public void test() 
	{
		Integer a = new Integer(3);
		Integer b = new Integer(3);
		
		logger.info(String.valueOf(a == b));
		
		assertTrue(true);
	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		
	}

	@Before
	public void setUp() throws Exception
	{
		
	}

	@After
	public void tearDown() throws Exception
	{
		
	}

}