package w05;

import java.io.*;
import java.util.*;

public class SortTest {
	public static void main(String[] args) {
		try
		{
			FileReader fr = new FileReader("input1.txt");
			BufferedReader br = new BufferedReader(fr);
			double[] list = new double[100];
			int cnt=0;
			
			while(true)
			{
				String line = br.readLine();
				if(line==null)
					break;
				double value = Double.parseDouble(line);
				list[cnt++]=value;
			}
			fr.close();
			double[] value = new double[cnt];
			System.arraycopy(list,0,value,0,cnt);
			Arrays.sort(value);
			
			FileWriter fw = new FileWriter("output1.txt");
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
