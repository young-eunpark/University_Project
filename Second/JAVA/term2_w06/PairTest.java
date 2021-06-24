package w06;

class Pair<T>
{
	private T a, b;
	Pair(T a, T b)
	{
		this.a=a;
		this.b=b;
	}
	T first()
	{
		return a;
	}
	T second()
	{
		return b;
	}
}
public class PairTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer>p1=new Pair<>(10,20);
		Pair<Double>p2=new Pair<>(10.0,20.0);
		
		System.out.println(p1.first());
		System.out.println(p2.second());
	}
}
