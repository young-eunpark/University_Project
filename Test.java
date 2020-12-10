package w04;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			sub();
		}
		catch(Exception e)
		{
			System.out.println("예외가 발생했습니다.\n"+e);
		}
	}
	public static void sub()
	{
		int[] array = new int[10];
		int i = array[10];
	}
}
