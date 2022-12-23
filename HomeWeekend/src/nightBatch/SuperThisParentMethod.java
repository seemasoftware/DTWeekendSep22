package nightBatch;

//public final class SuperThisParentMethod {-------- we can not inherit final class

public class SuperThisParentMethod {
	
	
	public void SuperThisParentMethod() {
	/* 	final int a=123;// Use of final and super keyword for variable   */
		
		
		this.SuperThisParentMethod(1,2,3);
		System.out.println("Parent Default Method");
	}
	public void SuperThisParentMethod(int a){
		this.SuperThisParentMethod(1,2);
		System.out.println("Parent One Parameter Method");
	}
	public void SuperThisParentMethod(int a, int b){
		this.SuperThisParentMethod();
		System.out.println("Parent Two Parameter Method");
	}
	public void SuperThisParentMethod(int a, int b, int c){
	
		System.out.println("Parent Three Parameter Method");
	}

}
