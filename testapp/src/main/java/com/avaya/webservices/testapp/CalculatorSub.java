package com.avaya.webservices.testapp;

 class CalculatorStub implements Calculator
{

	public int add(int i, int j) {
		
		return i+j;
	}

	public int sub(int i, int j) {
		return i-j;
	}

	public int mul(int i, int j) {
		return i*j;
	}
	
	public int div(int i, int j) {
		return i/j;
	}

	public Calculator getCalculator() {
		// TODO Auto-generated method stub
		return null;
	}
}
