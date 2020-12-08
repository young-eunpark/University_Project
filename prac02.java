package week002;

public class prac02 {
	public static void main(String args[])
	{
		char a[] = {'a','b','c'};
		String s = new String(a);
		
		for(int i=0; i<a.length;i++)
		{
			System.out.println(s.charAt(i));
		}
	}
}
