package com.entity;

public class OperationFactory {
	
	public static Operation createOperation(String symbol) {
		Operation oper = null;
		
		if(symbol.equals("+")){
			oper = new OperationAdd();
		}
		else if(symbol.equals("-")){
			oper = new OperationSub();
		}
		else if(symbol.equals("*")){
			oper = new OperationMul();
		}
		else if(symbol.equals("/")){
			oper = new OperationDiv();
		}
		else{
			System.out.println(" ‰»Î∑˚∫≈¥ÌŒÛ");
		}
		return oper;
	}
}
