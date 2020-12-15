package w07;

import java.util.*;
public class StackTest {
	public static void main(String[] args) {
			Stack<Integer> stack = new Stack<Integer>();
			for(int i = 0; i <args.length; i++) 
			{
				stack.push(new Integer(args[i]));
				System.out.println("���ÿ� push : "+ args[i]);
			}
			System.out.println("=============================");
			int n = stack.search(5);
			if (n != -1)
				System.out.println("���ÿ��� ���� '5'�� ��ġ�� : "+n+"��° �Դϴ�");
			else
				System.out.println("���ÿ��� ���� '5'�� �����ϴ�");
			System.out.println("=============================");
			while(!stack.empty()) {
				int m = stack.pop();
				System.out.println("���ÿ��� pop : " + m);
			}
		}
}
