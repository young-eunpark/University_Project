package w07;

import java.util.*;
public class StackTest {
	public static void main(String[] args) {
			Stack<Integer> stack = new Stack<Integer>();
			for(int i = 0; i <args.length; i++) 
			{
				stack.push(new Integer(args[i]));
				System.out.println("스택에 push : "+ args[i]);
			}
			System.out.println("=============================");
			int n = stack.search(5);
			if (n != -1)
				System.out.println("스택에서 숫자 '5'의 위치는 : "+n+"번째 입니다");
			else
				System.out.println("스택에서 숫자 '5'가 없습니다");
			System.out.println("=============================");
			while(!stack.empty()) {
				int m = stack.pop();
				System.out.println("스택에서 pop : " + m);
			}
		}
}
