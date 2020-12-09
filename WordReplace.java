package w03;

import java.util.Scanner;
public class WordReplace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = "우리는 oo대학교를 사랑합니다.";
		System.out.println("문자열 : "+ text);
		StringBuffer sb = new StringBuffer(text);
		
		String[] arr = text.split(" ");
		arr[1]=arr[1].replace("oo대학교를","oo대학교");
		boolean a=true;
		
		while(a) {
			System.out.print("입력  : ");
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
				System.out.println("종료합니다.");
				a=false;
			}
			else
				System.out.println("찾을 수 없습니다!");
		}
		
		scanner.close();
	}
}
