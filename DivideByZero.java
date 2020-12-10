package w04;

import java.util.*;

public class DivideByZero {
	public static void main(String[] args) {
		int number1, number2, result;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("ù��° ���� : ");
			number1 = sc.nextInt();
			System.out.print("�ι�° ���� : ");
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
			System.out.print("ù��° ���� : ");
			number1 = sc.nextInt();
			System.out.print("�ι�° ���� : ");
			number2 = sc.nextInt();
			
			result = number1/number2;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("���ܰ� �߻��߽��ϴ�.\n"+e);
		}
	}
}*/
