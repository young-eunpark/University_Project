package w03;

import java.util.Scanner;
public class WordReplace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = "�츮�� oo���б��� ����մϴ�.";
		System.out.println("���ڿ� : "+ text);
		StringBuffer sb = new StringBuffer(text);
		
		String[] arr = text.split(" ");
		arr[1]=arr[1].replace("oo���б���","oo���б�");
		boolean a=true;
		
		while(a) {
			System.out.print("�Է�  : ");
			String input = scanner.nextLine();
			String[] s = input.split(":");
			
			if(arr[0].equals(s[0]))
			{
				sb.replace(0, 3, s[1]);
				System.out.println(sb);
				continue;
			}
			if(arr[1].equals(s[0]))
			{
				sb.replace(4, 9, s[1]);
				System.out.println(sb);
				continue;
			}
			if(input.equals("display"))
			{
				System.out.println(sb);
				continue;
			}
			if(input.equals("stop"))
			{
				System.out.println("�����մϴ�.");
				a=false;
			}
			else
				System.out.println("ã�� �� �����ϴ�!");
		}
		
		scanner.close();
	}
}
