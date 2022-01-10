package com.assignment;
	import java.beans.Expression;

	import org.springframework.expression.ExpressionParser;
	import org.springframework.expression.spel.standard.SpelExpressionParser;

	public class SPEL {
		
		 public static void main(String[] args){
			 
		ExpressionParser parser = new SpelExpressionParser();
		//operators in SPEL
		//arithmetic operator
		System.out.println(parser.parseExpression("'Welcome SPEL'+'!'").getValue());
		System.out.println(parser.parseExpression("10 * 10/2").getValue());
		System.out.println(parser.parseExpression("'Today is: '+ new java.util.Date()").getValue());
		//logical operator
		System.out.println(parser.parseExpression("true and true").getValue());
		//Relational operator
		System.out.println(parser.parseExpression("'sonoo'.length()==5").getValue());
		}
		 
		}

