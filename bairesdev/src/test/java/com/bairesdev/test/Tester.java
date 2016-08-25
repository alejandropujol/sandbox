package com.bairesdev.test;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bairesdev.LambdaContainer;
import com.bairesdev.OrderedPair;
import com.bairesdev.Pair;

public class Tester
{

	private static Logger logger = LoggerFactory.getLogger(Tester.class);

	@Test
	public void testTryWithStatements() 
	{
		try (FileReader reader = new FileReader("C:\\HaxLogs.txt")) {
			char[] line = new char[25];
			reader.read(line);
			logger.info(String.valueOf(line));
		} catch (IOException e) {
			logger.error("Cannot read file", e);
		}
		
		assertTrue(true);
	}
	
	@Test
	@SuppressWarnings("unused")
	public void testDiamond() 
	{
		Pair<String, Integer> p1 = new OrderedPair<>("Even", 8);
		Pair<String, String>  p2 = new OrderedPair<>("Hello", "World");
		
		List<String> list = new ArrayList<>(Arrays.asList(new String[] {"A", "B", "C"}));
		
		logger.info(list.toString());
		
		assertTrue(true);
	}

	@Test
	public void testConcurrency() throws InterruptedException
	{
		logger.info("Running...");
		
		new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				for (int i = 0; i < 1000; i++) {
					logger.info("Hilo A - {}", i);
				}
			}
		}).start();
		
		new Thread(() -> logger.info("Hilo B")).start();
		
		Thread.sleep(1000);
		
		assertTrue(true);
	}
	
	@Test
	public void testLambda()
	{
		LambdaContainer container = new LambdaContainer();
		
		container.setLambdaExample(e -> 
		{
			logger.info(e);
			logger.info(e.toLowerCase());
			logger.info(e.toUpperCase());
		});
		
		container.getLambdaExample().test("Una Palabrita");
		container.getLambdaExample().test("Otra Palabra");
		
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