package com.capgemini.math;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capgemini.math.controller.MathController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MathApplicationTests {

	@Autowired
	private MathController mcontroller;
	@Test
	public void contextLoads() {
		assertThat(mcontroller).isNotNull();
	}
	
	@Test
	public void testAdditionOfTwoPositiveIntegers() {	
		assertEquals(30, mcontroller.addition(10, 20));
	}

	@Test
	public void testAdditionOfTwoNegativeIntegers() {	
		assertEquals(-30, mcontroller.addition(-10, -20));
	}
	@Test
	public void testAdditionOfOnePositiveOneNegativeIntegers() {	
		assertEquals(-10, mcontroller.addition(10, -20));
	}
	
}
