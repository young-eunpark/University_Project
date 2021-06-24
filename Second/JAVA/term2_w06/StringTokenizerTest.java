package w06;

import java.util.*;

public class StringTokenizerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] string = new String[100];
		int count=0;
		
		System.out.println("문자열을 입력하세요 : ");
		String str=scan.nextLine();
		
		StringTokenizer str1= new StringTokenizer(str);
		while(str1.hasMoreTokens())
		{	
			String s = str1.nextToken();
			string[count++] = s;
			System.out.println(s);
		}
		System.out.println("모두 "+count+"개의 단어가 있습니다.");
		
		String[] value=new String[count];
		System.arraycopy(string,0,value,0,count);
		Arrays.sort(value);
		
		System.out.println("======= 정렬 후 데이터 =======");
		System.out.print("[");
		for(int k=0; k<value.length;k++)
		{
			System.out.print(value[k]);
			if(k<value.length-1)
				System.out.print(",");
		}
		System.out.println("]");
	}
}

/*public class StringTokenizerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		
		System.out.println("문자열을 입력하세요 : ");
		String str=scan.nextLine();
		
		StringTokenizer str1= new StringTokenizer(str);
		while(str1.hasMoreTokens())
		{	
			System.out.println(str1.nextToken());
			count++;
		}
		System.out.println("모두 "+count+"개의 단어가 있습니다.");
	}
}*/
