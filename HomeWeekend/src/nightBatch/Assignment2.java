package nightBatch;

public class Assignment2 {

//Assignment2----((((10*2)-2)+2)-2)/2)
	
	public int sum (int a, int b) {
		int c= a+b;
		return c;
	}
	
	public int sub (int a, int b) {
		int d= a-b;
		return d;
	}
	
	public int mul (int a, int b) {
		int e= a*b;
		return e;
	}
	
	public int div (int a, int b) {
		int f= a/b;
		return f;
	}
	
	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		
		int res = obj.mul(10,2);
		int subres= obj.sub(res, 2);
		int sumres =obj.sum(subres, 2);
		int subres2= obj.sub(sumres, 2);
		int divres = obj.div(subres2, 2);
		
		System.out.println("((((10*2)-2)+2)-2)/2) final answer is :" +divres );
		}

}
