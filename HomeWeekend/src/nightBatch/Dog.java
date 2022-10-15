package nightBatch;

public class Dog extends Animal {
	public void barking() {
		System.out.println("Dog barking - child method");
	}
	public static void main(String[] args) {
		Dog c = new Dog();
		c.name();
		c.barking();
		c.colour();
		
			}
}
