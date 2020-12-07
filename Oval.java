package week001;

public class Oval implements Shape {
	private int width, height;
	public Oval(int w, int h)
	{
		this.width = w;
		this.height = h;
	}
	public void draw()
	{
		System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
	}
	public double getArea()
	{
		double area;
		area = (double)width * (double)height * PI;
		return area;
	}
}
