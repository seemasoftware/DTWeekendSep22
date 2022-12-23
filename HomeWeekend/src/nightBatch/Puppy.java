package nightBatch;

public class Puppy  extends Dog{
	public void brad() {
		System.out.println("brad name - this method is from baseclass which extend child class Dog");
	}
	public static void main(String[] args) {
		Puppy p = new Puppy();
		p.name();
		p.barking();
		p.brad();
		p.colour();
	}
}
