package w07;

import java.util.*;

public class FruitName {
	public static void main(String[] args) {		
		String[] fruit= {"orange","banana","apple","plum","pear"};
		LinkedList<String>name=new LinkedList<String>(Arrays.asList(fruit));
		
		System.out.println("==== for문을 이용한 원소 출력 ====");
		for(int i=0;i<fruit.length;i++)
		{
			System.out.println(fruit[i]);
		}
		
		System.out.println("==== for each문을 이용한 원소 출력 ====");
		for(String F:fruit)
		{
			System.out.println(F);
		}
		
		System.out.println("==== Iterator문을 이용한 원소 출력 ====");
		Iterator it=name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
