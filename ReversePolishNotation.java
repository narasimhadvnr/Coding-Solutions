

/*
 * 
 * 
 * Author D V Narasimha Rao
 */

import java.util.Scanner;
import java.util.Stack;

public class rpn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();		
		while(n>0)
		{
			String expression=scanner.next();
			Stack st=new Stack<Character>();
			for(char ch:expression.toCharArray())
			{				
				switch(ch)
				{
				
				case '+':						
						
				case '-':st.push(ch);						
						break;
						
				case '*':
				case '/':
							st.push(ch);
							break;
				case '(':					
							break;							
				case ')':
					     if(!st.isEmpty())
						  System.out.print(st.pop());
						break;
				case '^':
						st.push(ch);
						break;
				default: System.out.print(ch);
			//			System.out.println("Inserting "+ch);
				}  
		//		System.out.println(ch);
			}
			while(!st.isEmpty())
				System.out.print(st.pop());
			System.out.println();
			n--;
		}		
	}
}
