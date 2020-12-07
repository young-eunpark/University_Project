package week001;

interface Animal
{
	public void sound();
}
class Dog implements Animal
{
	public void sound()
	{
		System.out.println("�۸�~~");
	}
}
class Duck implements Animal
{
	public void sound()
	{
		System.out.println("�в�~~");
	}
}
public class AnimalDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Duck c = new Duck();
		makeSound(d);
		makeSound(c);
	}
	public static void makeSound(Animal a)
	{
		a.sound();
	}
}
