package w05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SortTest2 {

	public static void main(String[] args) {
		try
		{
			FileReader fr = new FileReader("output2.txt");
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
			Arrays.sort(value);
			
			FileWriter fw = new FileWriter("output3.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for(int k=0; k<value.length;k++)
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
