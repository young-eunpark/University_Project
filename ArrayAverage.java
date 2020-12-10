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
			System.out.println("��� ���� ���ܹ߻�\n"+e);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("�迭 ũ�� ���ܹ߻�\n"+e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�ε��� �� ���ܹ߻�\n"+e);
		}
		catch(NullPointerException e)
		{
			System.out.println("null �ʱ�ȭ ���ܹ߻�\n"+e);
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
			System.out.print("�Է� : ");
			array[i]=sc.nextInt();
			sum+=array[i];
		}
		System.out.println(sum);
		avg=sum/10;
		System.out.println("��� : "+avg);
	}
}
