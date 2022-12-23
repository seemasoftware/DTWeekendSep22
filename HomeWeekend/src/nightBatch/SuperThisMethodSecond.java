package nightBatch;

public class SuperThisMethodSecond extends SuperThisParentMethod{
public void SuperThisChildMethod() {
		super.SuperThisParentMethod(1, 2, 3);
		super.SuperThisParentMethod();
		super.SuperThisParentMethod(1, 2);
		super.SuperThisParentMethod(1);
		
		System.out.println("Child Default Method");
	}
	public void SuperThisChildMethod(int a){
		
		System.out.println("Child One Parameter Method");
	}
	public void SuperThisChildMethod(int a, int b){
		
	}
	public void SuperThisChildMethod(int a, int b, int c){
		
		System.out.println("Child Three Parameter Method");
	}

public static void main(String[] args) {
	SuperThisChildMethod s2 = new SuperThisChildMethod();
	s2.SuperThisChildMethod();
	s2.SuperThisChildMethod(1, 2, 3);
	s2.SuperThisChildMethod(1);
	s2.SuperThisChildMethod(1, 2);
}
}
