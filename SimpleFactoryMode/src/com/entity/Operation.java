package com.entity;

//����ĸ��� 
public class Operation {

	protected double numberA;		//����double��
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
	
	//��������ĺ��� 
	public double getResult() {
		double result = 0;
		return result;
	};
}
