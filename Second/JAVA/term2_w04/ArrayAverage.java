package w04;

import java.util.*;

public class ArrayAverage {
	public static void main(String[] args) {
		try
		{
			getAverage();
		}
		catch(ArithmeticException e)
		{
			System.out.println("산술 조건 예외발생\n"+e);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("배열 크기 예외발생\n"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("인덱스 값 예외발생\n"+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("null 초기화 예외발생\n"+e);
		}
	}
	public static void getAverage()
	{
		int sum=0;
		double avg=0;
		int[] array = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<array.length;i++)
		{
			System.out.print("입력 : ");
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		System.out.println(sum);
		avg=sum/10;
		System.out.println("평균 : "+avg);
	}
}
