package week001;

public class Circle implements Shape{
	private int radius;
	public Circle(int r)
	{
		this.radius = r;
	}
	public void draw()
	{
		System.out.println("�������� " + radius + "�� ���Դϴ�.");
	}
	public double getArea()
	{
		double area;
		area = PI * radius * radius;
		return area;
	}
}
