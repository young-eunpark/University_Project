package w07;

import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>low=new TreeSet<Integer>();
		TreeSet<Integer>even=new TreeSet<Integer>();
		
		for(int i=0;i<10;i++)
		{
			low.add(i);
			even.add(i*2);
		}

		TreeSet<Integer> total=new TreeSet<Integer>(low);
		TreeSet<Integer> difference=new TreeSet<Integer>(low);
		TreeSet<Integer> intersection=new TreeSet<Integer>(low);
		
		total.addAll(even);
		difference.removeAll(even);
		intersection.addAll(difference);
		
		System.out.println("����1 : "+low);
		System.out.println("����2 : "+even);
		System.out.println();
		System.out.println("������ : "+total);
		System.out.println("������ : "+difference);
		System.out.println("�������� : "+intersection);
		System.out.println();
		
		System.out.println("�������տ��� ���� ���� ���� : "+Collections.min(intersection));
		System.out.println("�����տ��� ���� ū ���� : "+Collections.max(difference));
		System.out.println();
		
		Iterator<Integer>it=intersection.iterator();
		int sum=0;
		while(it.hasNext())
		{
			sum+=it.next();
		}
		System.out.println("���������� ���� : "+sum);
		
		it=difference.iterator();
		sum=0;
		while(it.hasNext())
		{
			sum+=it.next();
		}
		System.out.println("�������� ���� : "+sum);

	}

}
