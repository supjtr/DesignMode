package com.entity;

//加法运算
public class OperationAdd extends Operation{
	
	//重写父类方法
	@Override
	public double getResult() {
		double result = 0;
		result = numberA + numberB;
		return result;
	}
}
