package w03;

import java.util.Scanner;
public class StringRotate {
	public static void main(String[] args) {
		System.out.println("���ڿ��� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
	
		
		for(int i=0;i<text.length();i++)
		{
			System.out.println(text.substring(i+1)+text.substring(0,i+1));
		}
		
		scanner.close();
	}
}
