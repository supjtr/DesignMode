package com.entity;

//�ӷ�����
public class OperationAdd extends Operation{
	
	//��д���෽��
	@Override
	public double getResult() {
		double result = 0;
		result = numberA + numberB;
		return result;
	}
}
