package w05;

import java.io.*;
public class ScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "이순신 : lee@korea.net\r\n" + 
				"홍길동 : hong@korea.net\r\n" + 
				"김유신 : kim@korea.net\r\n" + 
				"세종시 : king@korea.net";
		try
		{
			FileWriter fw = new FileWriter("input.dat");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(str);
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
