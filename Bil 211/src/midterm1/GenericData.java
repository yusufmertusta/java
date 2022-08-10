package midterm1;

import java.util.ArrayList;

class Ogrenci{
	String name;
	String surname;
	public Ogrenci(String n, String s){
		name = n;
		surname= s;
	}
	public boolean equals(Object o)
	{
		if(o == null) return false;
		if(o.getClass() != getClass()) return false;
		Ogrenci tmp = (Ogrenci) o;
		if(tmp.name.equals(name) && tmp.surname.equals(surname))
			return true;
		else return false;
	}
}

class CArray{
	int x;
	public CArray(int x){
		this.x = x;
	}
}

class Q1{}

class Y1 extends Q1{}
class Z1 extends Y1{}



public class GenericData {

	public static void method(ArrayList <? super Y1>y) 
	{	}
	
	
	public static void main(String[] args) {
		
		ArrayList<Q1> q = new ArrayList<>(); q.add(new Q1());
		ArrayList<Y1> y = new ArrayList<>(); y.add(new Y1());
		ArrayList<Z1> z = new ArrayList<>(); z.add(new Z1());
		
		method(q);
		method(y);
		method(z);
		ArrayList<String> string_arraylist = new ArrayList<String>();
		ArrayList<Integer> integer_arraylist = new ArrayList<>();
				
		// ----------------------------------------------------------------------------
		
		/*public static void mean(ArrayList<? extends Number> a)
		{
			
		}*/
		
		// ----------------------------------------------------------------------------
		
		/*	ArrayList<CArray> a = new ArrayList<CArray>();
		
		a.add(new CArray(0));
		a.add(new CArray(1));
		a.add(new CArray(2));
		
		ArrayList<CArray> d = (ArrayList<CArray>)a.clone();
		
		CArray c = a.get(0);
		c.x = 5;
		for(CArray ca: d) System.out.println(ca.x);
		
		ArrayList<CArray> deep_copied_arraylist = new ArrayList<CArray>();
		for(CArray ca: a)deep_copied_arraylist.add(ca);
		
		*/
		
		// ----------------------------------------------------------------------------	
		
	/*	ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);a.add(2);a.add(3);a.add(4);
		ArrayList<Integer> b= (ArrayList<Integer>)a.clone();
		System.out.println("B arraylisti");
		for(Integer i : b)
			System.out.println(i);
		b.remove(1);
		System.out.println("A arraylisti");
		for(Integer i : a)
			System.out.println(i);
		
		*/
				
		// ----------------------------------------------------------------------------
		
		//Object[] array = a.toArray();
		//for(int i=0;i<array.length;i++)
		//	System.out.println(array[i]);
		
		/*Integer [] integer_array = new Integer[6];
		Integer [] integer_array_2 = a.toArray(integer_array);
		for(int i=0;i<integer_array_2.length;i++)
			System.out.println(integer_array_2[i]);
		*/
		
		
		// ----------------------------------------------------------------------------
		
		/*ArrayList<Ogrenci> sinif = new ArrayList<Ogrenci>();
		
		sinif.add(new Ogrenci("a","b"));
		sinif.add(new Ogrenci("b","c"));
		sinif.add(new Ogrenci("d","e"));
		sinif.add(new Ogrenci("a","b"));
		
		Ogrenci o = new Ogrenci("a","b");
		//sinif.add(o);
		System.out.println(sinif.contains(o));
		
		sinif.ensureCapacity(50);
		sinif.trimToSize();
		
		*/
		
		
		// ----------------------------------------------------------------------------
		
		/*ArrayList<String> a = new ArrayList<String>(20);
		a.clear();
		
		if(a.contains("b")) System.out.println("b verisi bulunmakta");
		
		int index = a.indexOf("b");
		int lastindex = a.lastIndexOf("b");
		*/
				
		// ----------------------------------------------------------------------------
				
	/*	ArrayList<String> a = new ArrayList<String>(20);
		a.add("a");
		a.add("b");
		a.add("c");
		a.add("d");
		a.add("e");
		a.add("f");
		
		for(int i=0;i<a.size();i++)
			a.remove(i);
		
		/*int size = a.size();
		for(int i=size-1;i>=0;i-=2)
		{	
			a.remove(i);
		}
		for(String s : a) System.out.println(s);
		*/
	
		// ----------------------------------------------------------------------------
		
		/*ArrayList<String> a = new ArrayList<String>(20);
		a.add("5");
		a.add("6");
		a.add("7");
		a.add(0, "1");
		for(String s : a) System.out.println(s);
		System.out.println("Arraylist in boyutu: " + a.size());
		a.remove(1);
		System.out.println("1. indeks silindi");
		for(String s : a) System.out.println(s);
		a.remove("7");
		System.out.println("7 degerindeki veri silindii");
		for(String s : a) System.out.println(s);
		*/
	}

}
