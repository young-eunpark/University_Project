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
		
		System.out.println("집합1 : "+low);
		System.out.println("집합2 : "+even);
		System.out.println();
		System.out.println("합집합 : "+total);
		System.out.println("차집합 : "+difference);
		System.out.println("공통집합 : "+intersection);
		System.out.println();
		
		System.out.println("공통집합에서 가장 작은 값은 : "+Collections.min(intersection));
		System.out.println("차집합에서 가장 큰 값은 : "+Collections.max(difference));
		System.out.println();
		
		Iterator<Integer>it=intersection.iterator();
		int sum=0;
		while(it.hasNext())
		{
			sum+=it.next();
		}
		System.out.println("공통집합의 합은 : "+sum);
		
		it=difference.iterator();
		sum=0;
		while(it.hasNext())
		{
			sum+=it.next();
		}
		System.out.println("차집합의 합은 : "+sum);

	}

}
