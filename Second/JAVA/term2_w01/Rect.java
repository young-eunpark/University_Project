package week001;

public class Rect implements Shape{
	private int width, height;
	public Rect(int w, int h)
	{
		this.width = w;
		this.height = h;
	}
	public void draw()
	{
		System.out.println(width + "x" + height + "크기의 사각형입니다.");
	}
	public double getArea()
	{
		double area;
		area = width * height;
		return area;
	}
}
