package w05;

import java.io.*;
import java.util.*;

public class SortTest3 {

	public static void main(String[] args) {
		try
		{
			FileReader fr = new FileReader("output3.txt");
			BufferedReader br = new BufferedReader(fr);
			String num,number;
			double a;
			double[] list = new double[100];
			int cnt=0;
			while(true)
			{
				String line = br.readLine();
				if(line==null)
					break;
				StringTokenizer st = new StringTokenizer(line," : ");
				while(st.hasMoreTokens())
				{
					num=st.nextToken();
					number=st.nextToken();
					a = Double.parseDouble(number);
					list[cnt++]=a;
				}
			}
			fr.close();
			double[] value = new double[cnt];
			System.arraycopy(list,0,value,0,cnt);
			Collections.reverseOrder();
			
			FileWriter fw = new FileWriter("output4.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int k=value.length-1; k>=0;k--)
			{
				String bb = Double.toString(value[k]);
				bw.write((k+1)+" : "+bb);
				bw.newLine();
			}
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
