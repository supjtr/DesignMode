package com.entity;

//计算的父类 
public class Operation {

	protected double numberA;		//俩个double数
	protected double numberB;
	
	public Operation() {}
	
	public Operation(double numberA, double numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
	//进行运算的函数 
	public double getResult() {
		double result = 0;
		return result;
	};
}
