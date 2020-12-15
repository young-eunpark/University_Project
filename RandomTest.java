package w07;

import java.util.*;
public class RandomTest {
	public static void main(String[] args) {
//		LinkedHashSet<Integer>low=new LinkedHashSet<Integer>();
//		LinkedHashSet<Integer>even=new LinkedHashSet<Integer>();
		
		int d;
		
//		TreeSet<Integer>low=new TreeSet<Integer>();
//		TreeSet<Integer>even=new TreeSet<Integer>();
		
		HashSet<Integer>low=new HashSet<Integer>();
		HashSet<Integer>even=new HashSet<Integer>();
		
		for(int i=0;i<10;i++)
		{
			do {
				d=(int)((Math.random()*100.0)+1.0);
			}while(low.contains(d));
			low.add(d);
			
			do {
				d=(int)((Math.random()*100.0)+1.0);
			}while(even.contains(d));
			even.add(d);
		}
		
		//LinkedHashSet<Integer>union=new LinkedHashSet<Integer>(low);
		TreeSet<Integer>union=new TreeSet<Integer>(low);
//		HashSet<Integer>union=new HashSet<Integer>(low);
		
		union.addAll(even);
		//System.out.println("LinkedHashSet을 이용한 합집합");
		//System.out.println("TreeSet을 이용한 합집합");
		System.out.println("HashSet을 이용한 합집합");
		System.out.println();
		
		System.out.print("low 집합 : "+low+",");
		System.out.println("even 집합 : "+even);
		System.out.println();
		System.out.println("union 합집합 : "+union);
	}

}
