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
			System.out.println("실행매개변수가 부족하거나 숫자로 변환이 안됨");
		}
		catch(Exception e)
		{
			System.out.println("확인안된 오류.");
		}
	}
}
