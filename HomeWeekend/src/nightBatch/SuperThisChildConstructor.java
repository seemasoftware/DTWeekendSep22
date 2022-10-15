package nightBatch;

public class SuperThisChildConstructor extends SuperThisParentConstructor{
	public SuperThisChildConstructor(){
		this(1,2);
		System.out.println("Child Defualt Constructor");
	}
	public SuperThisChildConstructor(int a){
		this(1,2,3);
		System.out.println("Child One Parameter Constructor");
	}
	public SuperThisChildConstructor(int a, int b){
		super(1,2);
		System.out.println("Child Two Parameter Constructor");
	}
	public SuperThisChildConstructor(int a, int b, int c){
		this();
		System.out.println("Child Three Parameter Constructor");
	}
	
	public static void main(String[] args) {
		SuperThisChildConstructor s = new SuperThisChildConstructor(1);
	}

}
