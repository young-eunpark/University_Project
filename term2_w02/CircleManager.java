package week002;
class Circle
{
	int x,y,radius;
	public Circle(int x, int y, int r)
	{
		this.x=x;
		this.y=y;
		this.radius=r;
	}
	public boolean equals(Object o)
	{
		Circle c = (Circle)o;
		if(radius == c.radius) return true;
		else return false;
	}
}
public class CircleManager {
	public static void main(String[] args) {
		Circle c1 = new Circle(1,3,5);
		Circle c2 = new Circle(-3,1,4);
		Circle c3 = new Circle(10,13,5);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c2));
	}
}
