package week001;

public class Circle implements Shape{
	private int radius;
	public Circle(int r)
	{
		this.radius = r;
	}
	public void draw()
	{
		System.out.println("반지름이 " + radius + "인 원입니다.");
	}
	public double getArea()
	{
		double area;
		area = PI * radius * radius;
		return area;
	}
}
