
public class Qn10 {
	static int cal(int n) {

	String a=Integer.toString(n);
	
	int sum=Integer.parseInt(a)+Integer.parseInt(a+a)+Integer.parseInt(a+a+a);
	return sum;
	
	    
	}

	public static void main(String[] args) {
	int n=10;
	System.out.println("the value of n+nn+nnn for "+n+" is "+ cal(n)); // here it calculate as (10 + 1010 + 101010)

	}

}
