package w07;

import java.util.*;
public class HashSetTest1 {
	public static void main(String[] args) {
		HashSet<Integer>low=new HashSet<Integer>();
		HashSet<Integer>even=new HashSet<Integer>();
		
		for(int i=0;i<5;i++)
		{
			low.add(i);
			even.add(i*2);
		}
		System.out.println("low ���� : "+low);
		System.out.println("even ���� : "+even);
		HashSet<Integer> union=new HashSet<Integer>(low);
		HashSet<Integer> difference=new HashSet<Integer>(low);
		HashSet<Integer> intersection=new HashSet<Integer>(low);
		
		union.addAll(even);
		difference.removeAll(even);
		intersection.retainAll(even);
		
		System.out.println("������ : "+union);
		System.out.println("������ : "+difference);
		System.out.println("������ : "+intersection);
	}
}
