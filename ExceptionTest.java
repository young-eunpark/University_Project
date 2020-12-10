package w04;

import java.util.*;

public class ExceptionTest {
	public static void main(String[] args) {
		int sum=0,avg=0;
		Scanner sc = new Scanner(System.in);
		try 
		{
			String nu=args[0];
			String de=args[1];
		
			int value1=Integer.parseInt(nu);
			int value2=Integer.parseInt(de);
			
			int result=value1/value2;
			System.out.println(result);
		}
		catch(NumberFormatException|ArrayIndexOutOfBoundsException e)
		{
			System.out.println("����Ű������� �����ϰų� ���ڷ� ��ȯ�� �ȵ�");
		}
		catch(Exception e)
		{
			System.out.println("Ȯ�ξȵ� ����.");
		}
	}
}
