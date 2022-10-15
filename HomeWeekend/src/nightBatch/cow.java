package nightBatch;

public class cow extends Animal {
	public void methodcow() {
		System.out.println("this is hirarchical inheritance because it can call Animal class method but not Dog class method");
	}
	
	public static void main(String[] args) {
		cow c = new cow();
		c.colour();
		c.name();
		c.methodcow();
	}

}
