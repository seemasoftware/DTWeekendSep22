package nightBatch;

public class SuperThisChildMethod extends SuperThisParentMethod{
	public void SuperThisChildMethod() {
	/*	super.a=5;// if it is final in parent class it can not change */
		System.out.println("Child Default Method");
	}
	public void SuperThisChildMethod(int a){
		
		System.out.println("Child One Parameter Method");
	}
	public void SuperThisChildMethod(int a, int b){
		super.SuperThisParentMethod(1);
		this.SuperThisChildMethod();
		this.SuperThisChildMethod(1,2,3);
		this.SuperThisChildMethod(1);
		System.out.println("Child Two Parameter Method");
	}
	public void SuperThisChildMethod(int a, int b, int c){
		
		System.out.println("Child Three Parameter Method");
	}

public static void main(String[] args) {
	SuperThisChildMethod s1 = new SuperThisChildMethod();
	s1.SuperThisChildMethod(1, 2);
	
}
}
