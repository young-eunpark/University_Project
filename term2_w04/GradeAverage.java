package w04;

import java.util.*;

public class GradeAverage {
	public static void main(String[] args) {
		int num,grade,sum=0,avg=0;
		Scanner sc = new Scanner(System.in);
		try 
		{
			System.out.print("정수의 개수 : ");
			num = sc.nextInt();
		
			for(int i=0;i<num;i++)
			{
				System.out.print("정수를 입력하시오 : ");
				grade = sc.nextInt();
				checkNegative(grade);
				sum+=grade;
			}
			avg=sum/num;
			System.out.println("평균은 "+avg);
		}
		catch(NegativeNumberException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e+" 산술 오류");
		}
	}
	public static int checkNegative(int grade) throws NegativeNumberException
	{
		if(grade<0)
		{
			throw new NegativeNumberException("음수 입력 오류");
		}
		else
			return grade;
	}
}
class NegativeNumberException extends Exception
{
	public NegativeNumberException(String msg) 
	{
		super(msg);
	}
}
