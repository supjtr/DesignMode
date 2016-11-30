package test;

import java.util.Scanner;

import com.entity.*;
public class OperTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����һ����:");
		double numberA = sc.nextDouble();
		System.out.println("�����������");
		String symbol = sc.next().trim();
		System.out.println("����ڶ�����:");
		double numberB = sc.nextDouble();
		Operation oper = OperationFactory.createOperation(symbol);
		if(oper!=null){
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			System.out.println(oper.getResult());
		}
	}
}
