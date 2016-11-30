package com.entity;
//除法运算
public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		if(numberB == 0){
			System.out.println("除数不能为0");
			return result;
		}
		result = numberA / numberB;
		return result;
		
	}
}
