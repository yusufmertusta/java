package midterm1;

	public class A {
		
		public static void main(String[] args) {
			System.out.println(binary(8));
			int a = 7/2;
			System.out.println(a);
		}
		
		/*
		binary(7)
		1+binary(3)*10=111
		binary(3)=11
		1+binary(1)*10=11	
		*/
		
	 public static int binary(int n) {
		if(n<2)
			return n;
		 return (n%2)+binary(n/2)*10;
	}
		
		
}
	
	