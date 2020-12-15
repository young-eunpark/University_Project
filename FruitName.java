package w07;

import java.util.*;

public class FruitName {
	public static void main(String[] args) {		
		String[] fruit= {"orange","banana","apple","plum","pear"};
		LinkedList<String>name=new LinkedList<String>(Arrays.asList(fruit));
		
		System.out.println("==== for���� �̿��� ���� ��� ====");
		for(int i=0;i<fruit.length;i++)
		{
			System.out.println(fruit[i]);
		}
		
		System.out.println("==== for each���� �̿��� ���� ��� ====");
		for(String F:fruit)
		{
			System.out.println(F);
		}
		
		System.out.println("==== Iterator���� �̿��� ���� ��� ====");
		Iterator it=name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
