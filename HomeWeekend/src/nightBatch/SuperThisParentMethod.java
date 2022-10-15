package nightBatch;

public class SuperThisParentMethod {
	public void SuperThisParentMethod() {
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
