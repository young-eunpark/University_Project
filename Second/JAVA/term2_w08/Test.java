package w08;

class thread1 extends Thread
{
	public thread1(String str)
	{
		setName(str);
	}
	public void run() 
	{
		for(int i=0;i<10;i++) {
			System.out.println(getName()+" : "+i);
		}
		
	}
}	
class thread2 extends Thread
{
	public thread2(String str)
	{
		setName(str);
	}
	public void run() 
	{
		for(int i=0;i<10;i++) {
			System.out.println(getName()+" : "+i);
		}
		
	}
}	
public class Test {
	public static void main(String[] args) {
		thread1 t1=new thread1("1st Thread");
		thread2 t2=new thread2("2nd Thread");
		t1.start();
		t2.start();
	}
}

/*class Job extends Thread
{
	public Job(String str)
	{
		setName(str);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(getName()+" : "+ i);
	}
}
public class Test {
	public static void main(String[] args) {
		Job j1=new Job("Thread");
		j1.start();
	}
}*/

/*class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
			System.out.println(i);
	}
}
public class Test {
	public static void main(String[] args) {
		Thread1 j1=new Thread1();
		j1.start();
	}
}*/

/*class Job implements Runnable
{
	public void run()
	{
		for(int n=0;n<10;n++)
			System.out.println(n);
	}
}
public class Test {
	public static void main(String[] args) {
		Thread j1=new Thread();
		j1.start();
	}
}*/
