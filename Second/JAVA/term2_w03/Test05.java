package w03;

public class Test05 {
	public static void main(String[] args)
	{
		StringBuffer s1 = new StringBuffer("Hello");
		System.out.println(s1);
		
		s1.append(" world");
		System.out.println(s1);
		
		s1.insert(5, "java");
		System.out.println(s1);
		
		s1.replace(6, 10, "my");
		System.out.println(s1);
	}
}
