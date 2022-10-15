package nightBatch;

public class SuperThisParentConstructor {
	
	public SuperThisParentConstructor() {
		this(1,2,3);
		System.out.println("Parent Default Constructor");
	}
	public SuperThisParentConstructor(int a){
		this();
		System.out.println("Parent One Parameter Constructor");
	}
	public SuperThisParentConstructor(int a, int b){
		this(1);
		System.out.println("Parent Two Parameter Constructor");
	}
	public SuperThisParentConstructor(int a, int b, int c){
		
		System.out.println("Parent Three Parameter Constructor");
	}

}
