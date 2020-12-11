package w05;

import java.io.*;

public class SortTest1 {
	public static void main(String[] args) {
		try
		{
			FileReader fr1 = new FileReader("output.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			FileReader fr2 = new FileReader("output1.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			FileWriter fw = new FileWriter("output2.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			while(true)
			{
				String line = br1.readLine();
				if(line==null)
					break;
				bw.write(line);
				bw.newLine();
			}
			while(true)
			{
				String line = br2.readLine();
				if(line==null)
					break;
				bw.write(line);
				bw.newLine();
			}
			bw.close();
			br1.close();
			br2.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
