package nightBatch;

public class Basic {
	int age;
	int roll_no;
	
	public void display1() {
		System.out.println("welcome");
	}
	
	public void display2() {
		System.out.println("automation");
	}
	
	
	public static void main(String[] args) {
		Basic ob1 = new Basic();
		ob1.age=5;
		ob1.roll_no=10;
		ob1.display1();
		ob1.display2();
		System.out.println(ob1.age);
		System.out.println(ob1.roll_no);
		
	}
	

}
