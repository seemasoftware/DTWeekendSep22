package nightBatch;

public class Student {
	int roll_no;
	int age;
	
	public void display11() {
		System.out.println("Welcome to all of you");
	}
	
	public void dispaly2() {
		System.out.println("automation very easy\r\n");
	}

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.roll_no=10;
		stu.age=30;
		
		stu.display11();
		stu.dispaly2();
		System.out.println(stu.roll_no);
		System.out.println(stu.age);
		
	}

}
