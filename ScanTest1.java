package w05;

import java.io.*;
import java.util.*;

public class ScanTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		try
		{
			FileReader fr = new FileReader("input.dat");
			BufferedReader br = new BufferedReader(fr);
			while(true)
			{
				if((s1=br.readLine())==null)
					break;
				System.out.println(s1);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
