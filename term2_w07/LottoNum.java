package w07;

import java.util.*;
public class LottoNum {
	public static void main(String[] args) {
		HashSet<Integer>set1=new HashSet<Integer>();
		TreeSet<Integer>set2=new TreeSet<Integer>();
		
		int d;
		for(int i=0;i<6;i++)
		{
			d=0;
			do {
				d=(int)((Math.random()*45.0)+1.0);
			}while(set1.contains(d));
			set1.add(d);
			
			do {
				d=(int)((Math.random()*45.0)+1.0);
			}while(set2.contains(d));
			set2.add(d);
		}
		System.out.println("Lotto번호(Hashset) ="+set1);
		System.out.println("Lotto(Treeset) ="+set2);
	}
}
