package nightBatch;

public class Assign1Constructor {
	
	public Assign1Constructor() {
		this(1,2,3);
		System.out.println(" Default parameterised constructor");
			}
	
	public Assign1Constructor(int a) {
		this(1,2);
		System.out.println(" One parameterised constructor");
	}
	
	public Assign1Constructor(int a, int b) {
		this();
		System.out.println(" Two parameterised constructor");
			}
	public Assign1Constructor(int a, int b, int c) {
		System.out.println(" Three parameterised constructor");	
	}
	
	public static void main(String[] args) {
		// Creating Constructor object for one parameter
		Assign1Constructor obj = new Assign1Constructor(1);
	}

}
