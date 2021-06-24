package w08;

class Sum extends Thread
{
	int begin, end;
	long sum,total;
	public Sum(int b, int e)
	{
		this.begin=b;
		this.end=e;
	}
	long re()
	{
		return sum;
	}
	public void run()
	{
		for(int i=begin;i<=end;i++)
			sum+=i;
		total+=sum;
	}
}
public class ThreadSum {
	public static void main(String[] args)
	{
		Sum s1=new Sum(1,300000);
		Sum s2=new Sum(300001,600000);
		Sum s3=new Sum(600001,900000);
		
		long start=System.nanoTime();
		s1.start();
		s2.start();
		s3.start();
		long end=System.nanoTime();
		long totalTime=end-start;
		try {
			s1.join();
			s2.join();
			s3.join();
		}catch(Exception e) {}
//		System.out.println("1-300000의 합 =      "+s1.re());
//		System.out.println("300001-600001의 합 = "+s2.re());		
//		System.out.println("600001-900000의 합 = "+s3.re());
		System.out.println("thread 합계 = "+(s1.total+s2.total+s3.total));
		System.out.println("실행시간 (스레드 이용) = "+(start+end));		
		
		long sum1=0;
		long start1=System.nanoTime();
		for(int i=1;i<=900000;i++)
			sum1+=i;
		long end1=System.nanoTime();
		long totalTime1=end1-start1;
		
		System.out.println("\n전체계산 합계 = "+sum1);
		System.out.println("실행시간 (전체) = "+(start+end));		
		
		System.out.println("\n실행시간 차이 = "+(totalTime-totalTime1));
	}
}
