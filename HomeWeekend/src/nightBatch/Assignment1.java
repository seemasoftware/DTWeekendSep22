package nightBatch;

public class Assignment1 {
	//((((10+2)-2)+2)*2)/2)
	
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
	 Assignment1 obj = new Assignment1();
	 
	int sumresult=obj.sum(10,2);
	int subresult=obj.sub(sumresult,2);
	int sumresult2 =obj.sum(subresult,2);
	int mulresult =obj.mul(sumresult2,2);
	int divresult =obj.div(mulresult, 2);
	
	
	System.out.print("((((10+2)-2)+2)*2)/2) answer for this is: "+ divresult);
	 	}

}
