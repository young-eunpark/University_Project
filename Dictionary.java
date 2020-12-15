package w07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Dictionary {

	public static void main(String[] args) {
		String str = "report ����\r\n" + 
				"lab �����\r\n" + 
				"word �ܾ�\r\n" + 
				"mean �ǹ�\r\n" +
				"map ����\r\n" +
				"school �б�\r\n" +
				"various ��������\r\n" +
				"implement ����\r\n" +
				"like �����ϴ�\r\n" +
				"equal ����";
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

