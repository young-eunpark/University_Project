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
			System.out.println("���ܰ� �߻��߽��ϴ�.\n"+e);
		}
	}
	public static void sub()
	{
		int[] array = new int[10];
		int i = array[10];
	}
}
