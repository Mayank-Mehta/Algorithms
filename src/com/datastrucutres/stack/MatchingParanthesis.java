package com.datastrucutres.stack;

import java.util.HashMap;
import java.util.Map;

public class MatchingParanthesis {
	static Map<String,String> paranthesisPairs = new HashMap<String, String>();
	static {
		
		paranthesisPairs.put("{", "}");
		paranthesisPairs.put("[", "]");
		paranthesisPairs.put("(", ")");
		
	}
	public boolean isValidExpression(String expression) throws Exception{
		
		Stack<String> s = new Stack<String>();
		for (int i = 0; i < expression.length(); i++) {
			//if open comes put in stack if close comes pop it
			if(paranthesisPairs.containsKey(expression.charAt(i)+"")){
				s.push(expression.charAt(i)+"");
			}else if(paranthesisPairs.containsValue(expression.charAt(i)+"")) {
				String element = s.pop();
				if(!(expression.charAt(i)+"").equals(paranthesisPairs.get(element))){
					return false;
				}
			}
		}
		if(s.isEmpty()) {
			return true;
		}
		return false;
		
	}
	
	
	
	
	public static void main(String[] args) throws Exception{
		MatchingParanthesis p = new MatchingParanthesis();
		System.out.println(p.isValidExpression("(ABC{DEF}[LMN(DEF)]"));
	}
}
