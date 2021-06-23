package w03;

public class Test04 {
	public static void main(String[] args) {
		String s1 = "java\t";
		String s2 = ",C++,C";
		String s3 = "java";
		
		System.out.println(s1+s2+s3);
		
		System.out.println("Before Trim : "+"\"" + s1 + "\"");
		s1 = s1.trim();
		System.out.println("After Trim : "+"\""+s1+"\"");
		
		System.out.println("문자열 s1에 v문자 들어있는지 여부 : "+s1.contains("V"));
		
		s1 = s1.concat(s2);
		System.out.println(s1);
		
		String ss[] = s1.split(s1);
		for(String s:ss)
			System.out.println(s);
		
		s1 = s1.replace("java", "Python");
		System.out.println(s1);
		
		s1 = s1.substring(8);
		System.out.println(s1);
		System.out.println(s1.charAt(0));
	}
}
