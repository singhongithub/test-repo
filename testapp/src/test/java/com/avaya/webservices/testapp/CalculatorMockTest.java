package com.avaya.webservices.testapp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorMockTest {

	@Test
	public void AddTest() {

		Calculator mockCalculator = Mockito.mock(Calculator.class);
		Mockito.when(mockCalculator.add(4,5)).thenReturn(9);
		
		Mockito.when(mockCalculator.getCalculator()).thenReturn(mockCalculator);
		
		//System.out.println(mockCalculator.add(4,5));
		assertEquals(9, mockCalculator.add(4, 5));
		
	}
	
	@Test
	public void SubTest() {

		Calculator mockCalculator = Mockito.mock(Calculator.class);
		Mockito.when(mockCalculator.sub(8,6)).thenReturn(2);
		
		assertEquals(2, mockCalculator.sub(8, 6));
		
	}
	
	@Test
	public void MulTest() {

		Calculator mockCalculator = Mockito.mock(Calculator.class);
		Mockito.when(mockCalculator.mul(1,3)).thenReturn(3);
		assertEquals(3, mockCalculator.mul(1, 3));
		
	}
	
	@Test(expected =  ArithmeticException.class)
	public void ExceptionTest() {

		Calculator mockCalculator = Mockito.mock(Calculator.class);
		Mockito.when(mockCalculator.div(1,0)).thenThrow(new ArithmeticException());
		
		System.out.println(mockCalculator.div(1,0));
		
	}

}
