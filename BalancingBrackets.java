package com.greatlearning.app;

import java.util.Stack;

public class BalancingBrackets {



public static void main(String[] args)
{
	String expression="([[{}]])";
	boolean checkExp=checkexpression(expression);
	if(checkExp==true) {
		System.out.println("The entered String has Balanced Brackets");
	}
	else {
		System.out.println("The entered String do not contain Balanced Brackets");	
	}
		
}

private static boolean checkexpression(String expression) {
	Stack<Character> expressionstack= new Stack<Character>();
	for(int i=0;i<expression.length();i++) {
		
		char ch=expression.charAt(i); 
		
		if(ch=='{' || ch=='('|| ch=='[')
		{
			expressionstack.push(ch);
		    continue;
		} 
		
		if (expressionstack.isEmpty())
		return false;
		char popelement;
			switch(ch){
			case '}': 
				popelement=expressionstack.pop();
				if(popelement =='(' || popelement =='[')
		        return false;
				break;
			case ']': 
				popelement=expressionstack.pop();
				if(popelement =='{' || popelement =='(')
		        return false;
				break;
			case ')': 
				popelement=expressionstack.pop();
				if(popelement =='{' || popelement =='[')
		        return false;
				break;
		
			}	        	
	}
	
	return expressionstack.isEmpty();	
}

}



