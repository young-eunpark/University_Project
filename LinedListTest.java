package w07;

import java.util.*;
public class LinedListTest {

	public static void main(String[] args) {
		LinkedList<Integer> low=new LinkedList<Integer>();
		LinkedList<Integer> even=new LinkedList<Integer>();
		
		for(int i=0;i<10;i++)
		{
			low.add(i);
			even.add(i*2);
		}
		
		LinkedList<Integer> total=new LinkedList<Integer>(low);
		LinkedList<Integer> difference=new LinkedList<Integer>(low);
		LinkedList<Integer> intersection=new LinkedList<Integer>(low);
		
		total.addAll(even);
		difference.removeAll(even);
		intersection.retainAll(even);
		
		System.out.println("홀수 : "+low);
		System.out.println("짝수 : "+even);
		System.out.println();
		System.out.println("합 : "+total);
		System.out.println("공통 : "+intersection);
		System.out.println("차 : "+difference);
		System.out.println();
		
		System.out.println("공통에서 가장 작은 값은 : "+Collections.min(intersection));
		System.out.println("차에서 가장 큰 값은 : "+Collections.max(difference));
		Iterator<Integer>it=intersection.iterator();
		int sum=0;
		while(it.hasNext())
		{
			sum+=it.next();
		}
		System.out.println("공통의 합은 : "+sum);
		
		it=difference.iterator();
		sum=0;
		while(it.hasNext())
		{
			sum+=it.next();
		}
		System.out.println("차의 합은 : "+sum);
	}

}
