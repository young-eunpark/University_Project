package w06;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("하나를 선택하시오 : 가위(0), 바위(1), 보(2) : ");
		int m = scan.nextInt();
		int c = rand.nextInt(3);
		String com=null;
		
		if(c==0) com="가위";
		if(c==1) com="바위";
		if(c==2) com="보";
		
		switch(m)
		{
			case 0:
				if(c==0)
					System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신과 비겼습니다.");
				if(c==1)
					System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신이 졌습니다.");
				if(c==2)
					System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신이 이겼습니다.");
				break;
			case 1:
				if(c==0)
					System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신이 이겼습니다.");
				if(c==1)
					System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신과 비겼습니다.");
				if(c==2)
					System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신이 졌습니다.");
				break;
		 	case 2:
		 		if(c==0)
		 			System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신이 졌습니다.");
		 		if(c==1)
		 			System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신이 이겼습니다.");
		 		if(c==2)
		 			System.out.println("컴퓨터는 "+com+"를 냈습니다.\n당신과 비겼습니다.");
		 		break;
		 	default:
		 		System.out.println("잘못된 숫자입니다.");
		 		break;
		}
	}
}
