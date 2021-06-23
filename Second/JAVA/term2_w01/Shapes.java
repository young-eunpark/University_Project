package week001;

public class Shapes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println("면적은 : " + donut.getArea());
	}
}
