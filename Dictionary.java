package w07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Dictionary {

	public static void main(String[] args) {
		String str = "report 과제\r\n" + 
				"lab 실험실\r\n" + 
				"word 단어\r\n" + 
				"mean 의미\r\n" +
				"map 지도\r\n" +
				"school 학교\r\n" +
				"various 여러가지\r\n" +
				"implement 구현\r\n" +
				"like 좋아하다\r\n" +
				"equal 같다";
		try
		{
			FileWriter fw = new FileWriter("dic.dat");
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

