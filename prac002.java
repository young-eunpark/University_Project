package week002;

class MyPoint
{
	int a, b;
	public MyPoint(int x, int y)
	{
		this.a=x;
		this.b=y;
	}
	public String toString()
	{
		return "MyPoint("+a+","+b+")";
	}
}
public class prac002 {
	public static void main(String[] args) {
		MyPoint a = new MyPoint(3,20);
		System.out.println(a);
	}
}

/*public class prac002 {

	public static void main(String[] args) {
		Double number = 3.14;
		
		System.out.println("3.14�� 16������ ǥ�� : "+ number.toHexString(number));
	}
}*/

/*public class prac002 {

	public static void main(String[] args) {
		Integer number = 1234;
		
		System.out.println("1,234�� 2������ ǥ�� : " + number.toBinaryString(number));
		System.out.println("1,234�� 8������ ǥ�� : " + number.toOctalString(number));
		System.out.println("1,234�� 16������ ǥ�� : " + number.toHexString(number));	
	}
}*/
