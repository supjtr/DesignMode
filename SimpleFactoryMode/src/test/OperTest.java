package test;

import java.util.Scanner;

import com.entity.*;
public class OperTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个数:");
		double numberA = sc.nextDouble();
		System.out.println("输入运算符号");
		String symbol = sc.next().trim();
		System.out.println("输入第二个数:");
		double numberB = sc.nextDouble();
		Operation oper = OperationFactory.createOperation(symbol);
		if(oper!=null){
			oper.setNumberA(numberA);
			oper.setNumberB(numberB);
			System.out.println(oper.getResult());
		}
	}
}
