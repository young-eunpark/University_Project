package w06;

import java.util.Random;
import java.util.Scanner;

public class RandomTest {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ϳ��� �����Ͻÿ� : ����(0), ����(1), ��(2) : ");
		int m = scan.nextInt();
		int c = rand.nextInt(3);
		String com=null;
		
		if(c==0) com="����";
		if(c==1) com="����";
		if(c==2) com="��";
		
		switch(m)
		{
			case 0:
				if(c==0)
					System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n��Ű� �����ϴ�.");
				if(c==1)
					System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n����� �����ϴ�.");
				if(c==2)
					System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n����� �̰���ϴ�.");
				break;
			case 1:
				if(c==0)
					System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n����� �̰���ϴ�.");
				if(c==1)
					System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n��Ű� �����ϴ�.");
				if(c==2)
					System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n����� �����ϴ�.");
				break;
		 	case 2:
		 		if(c==0)
		 			System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n����� �����ϴ�.");
		 		if(c==1)
		 			System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n����� �̰���ϴ�.");
		 		if(c==2)
		 			System.out.println("��ǻ�ʹ� "+com+"�� �½��ϴ�.\n��Ű� �����ϴ�.");
		 		break;
		 	default:
		 		System.out.println("�߸��� �����Դϴ�.");
		 		break;
		}
	}
}
