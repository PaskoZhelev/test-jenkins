package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class HelloWorldTest {

	@InjectMocks
	private HelloWorld cut;
	
	@Before
	public void setUp() throws Exception {
		cut = new HelloWorld();
	}

	@Test
	public void testGetHelloWorld() {
		assertEquals("Hello World", cut.getHelloWorld());
	}

}
