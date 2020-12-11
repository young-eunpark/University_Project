package w05;

import java.io.*;
import java.util.*;

public class StudentTest {
	public static void main(String[] args) {
		int cnt=0;
		try
		{
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"));
			
			String num;
			int grade;
			String name;
			String tel_number;
			Student stu;
			
			while(true)
			{
				String line = br.readLine();
				if(line==null)
					break;
				StringTokenizer st = new StringTokenizer(line);
				cnt++;
				while(st.hasMoreTokens())
				{
					num=st.nextToken();
					grade=Integer.parseInt(st.nextToken());
					name=st.nextToken();
					tel_number=st.nextToken();
					stu= new Student(num,grade,name,tel_number);
					oos.writeObject(stu);
				}
			}
			System.out.println("학생 개체는 총 "+cnt+"개 생섬됨.");
			fr.close();
			oos.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}
