package midterm1;

public class power {
	public static void main(String[] args) {
	int a = power(2,9);
	System.out.println(a);
	}

	public static int power(int a,int b) {
		if(b==0)
			return 1;
		else
		return  a*power(a,b-1);
	}

}
