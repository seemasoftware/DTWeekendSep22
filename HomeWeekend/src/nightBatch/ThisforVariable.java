package nightBatch;


public class ThisforVariable {
	String name = "abc"; // global variable
	
	public void methoda(String name) {
		this.name =name;// giving value to local variable to global variable
		}
	
	public static void main(String[] args) {
		ThisforVariable t = new ThisforVariable();
		t.methoda("xyz");
		System.out.println("value of name :"+t.name);
	}

}
