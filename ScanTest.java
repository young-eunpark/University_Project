package w05;

import java.io.*;
public class ScanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "�̼��� : lee@korea.net\r\n" + 
				"ȫ�浿 : hong@korea.net\r\n" + 
				"������ : kim@korea.net\r\n" + 
				"������ : king@korea.net";
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
