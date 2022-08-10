package midterm1;
import java.util.*;

public class MyList22<T extends Comparable<T>> {
	
	 ArrayList<T> list = new ArrayList<>();
	 ArrayList<T> alist = new ArrayList<>();	
	 
	 public static void main(String[] args) {
			MyList22<Integer> list = new MyList22<>();
			list.add(2);
			list.add(5);
			list.add(1);
			list.add(1);
			list.add(2);
			list.add(4);
			list.removee(4);
	 }
		
	void MyList(){
		list = new ArrayList<>(10);
	}
	
	void MyClass(int i){
		list = new ArrayList<>(i);
	}
	
	void add(T t) {
		list.add(t);
	}
	
	public T removee(int i) {
		T a = list.get(i);
		list.remove(i);
		System.out.println(a);
		return a;
	}
	
	public boolean removee(T t) {
		if(list.contains(t)) {
			list.remove(t);
			System.out.println(t);
			System.out.println(true);
			return true;
		}
		System.out.println(false);
		return false;
	}
	void print() {
		System.out.println(list);
	}
	
	void joinR(ArrayList<T> alist) {
		for(int i=0;i<list.size();i++) {
			for(int a=0;a<alist.size();a++) {
				if(list.get(i).equals(alist.get(a)))
						list.remove(i);
			}
		}
	}
	
	/*void joinT(ArrayList<T> alist) {
		for(int i=0;i<list.size();i++) {
			for(int a=0;a<alist.size();a++) {
				if(list.get(i).equals(alist.get(a)))
						
			}
		}
	}*/
	
	void sort() {
		
	}
	
	  void duplicate() {
		  for(int i=0;i<list.size();i++) {
			  if(.compareTo()==0)
					System.out.print(+ " ");
			  
		  }
				
			
	
	}
}















 



	