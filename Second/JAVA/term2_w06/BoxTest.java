package w06;

class Box<T>
{
	T A;
	void set(T a)
	{
		A=a;
	}
	T get()
	{
		return A;
	}
}
public class BoxTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer>i=new Box<>();
		i.set(100);
		System.out.println(i.get());
		
		Box<String>s=new Box<>();
		s.set("Hello!");
		System.out.println(s.get());
	}
}
