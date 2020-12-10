package w04;

import java.util.*;

public class DivideByZero {
	public static void main(String[] args) {
		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("첫번째 정수 : ");
			number1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			number2 = sc.nextInt();
		
			result = quotient(number1,number2);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static int quotient(int numerator, int denominator) throws DivideByZeroException
	{
		if(denominator==0)
			throw new DivideByZeroException();
		return numerator/denominator;
	}
}
class DivideByZeroException extends Exception
{
	public DivideByZeroException() {}
}

/*public class DivideByZero {
	public static void main(String[] args) {
		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.print("첫번째 정수 : ");
			number1 = sc.nextInt();
			System.out.print("두번째 정수 : ");
			number2 = sc.nextInt();
			
			result = number1/number2;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("예외가 발생했습니다.\n"+e);
		}
	}
}*/
