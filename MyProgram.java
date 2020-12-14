package w06;

public class MyProgram {
	public static<T> void swap(T[] a,int i, int j)
	{
		T tmp = a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}
