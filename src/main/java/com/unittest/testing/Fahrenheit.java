package com.unittest.testing;

public class Fahrenheit {
	private double celcius;
	private double fahrenheit;
	
	public double getCelcius() {
		return celcius;
	}
	
	public void input(double celcius) {
		this.celcius = celcius;
	}
	
	public boolean isBound(double celcius) {
		boolean isResult;
		if(celcius >= -1000 && celcius<=1000 ) {
			isResult = true;
		}else {
			isResult = false;
		}
		return isResult;
	}
	
	public void calculate() {
		this.fahrenheit = this.celcius*9/5+32;
	}
	
	public double getCalculate() {
		return this.fahrenheit;
	}
	
	public String toString() {
		double fahrenheit = this.getCalculate();
		double celcius = this.getCelcius();
		return Math.round(celcius) + " celcius = " + Math.round(fahrenheit) + " fahrenheit";
	}

}
