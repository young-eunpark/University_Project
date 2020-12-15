package w07;

import java.util.*;
public class LottoNum2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		HashSet<Integer>set=new HashSet<Integer>();
		
		int d;
		
		do
		{
			System.out.println("구입갯수?");
			int n=scan.nextInt();
			
			for(int i=0;i<n;i++)
			{
				d=0;
				set.removeAll(set);
				for(int j=0;j<6;j++)
				{
					do {
						d=(int)((Math.random()*45.0)+1.0);
					}while(set.contains(d));
					set.add(d);
				}
				System.out.println("Lotto "+(i+1)+"="+set);
			}
			System.out.println("다른 번호를 원하십니까?");
			String s=scan.next();
			if(s.equals("y")||s.equals("Y"))
				continue;
			else {
				System.out.println("감사합니다!!");
				break;
			}
				
		}while(true);
		
	}

}
