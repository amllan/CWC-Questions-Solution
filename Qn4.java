
public class Qn4 {
static boolean check_automorphic(int n) {

	
	
	int s=(int)Math.pow(n,2);
	
	String a=Integer.toString(n);
	String b=Integer.toString(s);
	
	if (b.endsWith(a)) {
		return true;
	}else
		
	return false;
	}
	
	public static void main(String[] args) {
		int n=5;
		
	if (check_automorphic(n)) {
		System.out.println("The number "+n+" is automorphic");
	}
	else {
		System.out.println("The number "+n+" is not automorphic");
	}

	}

}
