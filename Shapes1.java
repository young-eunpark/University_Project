package week001;

public class Shapes1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape [] list = new Shape[3];
		list[0] = new Circle(10);
		list[1] = new Oval(20, 30);
		list[2] = new Rect(10, 40);
		
		for(int i=0; i<list.length; i++) list[i].redraw();
		for(int i=0; i<list.length; i++) System.out.println("������ " + list[i].getArea());
	}
}
