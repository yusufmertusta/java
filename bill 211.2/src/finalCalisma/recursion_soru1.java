package finalCalisma;

public class recursion_soru1 {

	
	public static void met(int a) {
		if(a<10) {
		System.out.println(a);
		}
		else{
		met(a/10);
		System.out.println(a%10);
			
		}
	}
	
	public static int fac(int n) {
		if(n<3) {
		return n;
		}
		else {
			return fac(n-1)*n;
		}
		
	}
	
	public static int fib(int n) {
		if(n<3)
			return 1;
		
		return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		//met(1234);
		//System.out.println(fac(4));
		System.out.println(fib(4));
	}
}
