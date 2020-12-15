package w07;

import java.io.*;
import java.util.*;

public class English2Kor {
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("dic.dat");
		BufferedReader br=new BufferedReader(fr);
		
		Map<String,String>dic=new HashMap<String,String>();
		String str,eng,kor;
		
		while((str=br.readLine())!=null)
		{
			StringTokenizer st=new StringTokenizer(str);
			eng=st.nextToken();
			kor=st.nextToken();
			dic.put(kor, eng);
		}
		
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.print("�ѱ� ? ");
			String key=sc.next();
			if(key.equals("�׸�")) {
				System.out.println("����!");
				break;
			}
			if(dic.get(key)!=null)
				System.out.println("���� : "+dic.get(key));	
			else
				System.out.println("���� �ܾ�!");
		}while(true);
	}
}
