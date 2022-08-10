package Lab7;

public class Duo<A,B> {
	public A obj1,t1;
	public B obj2,t2;
	
	
	public Duo(A obj1, B obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	

	public A former() {
		return obj1;
	}

	public B latter() {
			return obj2;
	}

	public void swap_places() {
	     t1 = obj1;
	     t2 = obj2;
		 this.obj2 = (B) t1;
		 this.obj1 = (A) t2;
	}

	public String concat() {
		return toString();
	}
	
	@Override
	public String toString() {
		return obj1.toString()+obj2.toString();
	}
	
	
	 
}

