package com.entity;
//��������
public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		double result = 0;
		if(numberB == 0){
			System.out.println("��������Ϊ0");
			return result;
		}
		result = numberA / numberB;
		return result;
		
	}
}
