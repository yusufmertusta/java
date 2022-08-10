package midterm1;

interface E{
	String s = "E";
	String m();
}
interface E2 extends E{
	//String s = "E2";
}
class G2 implements E2
{
	//String s = "G2";
	public String m(){return null;}
}
abstract class F
{
	String s = "F";
	public abstract String m();
}
class G extends F implements E{
	public String m(){
		System.out.println(super.s + E.s);
		return super.s + E.s;
	}
}
class Outer{
	private static void outer_method(){
	//	inner_method();
		
	}
	public  static class Static_Inner{
		int x;
		static int y;
		static void inner_method(){
			outer_method();
		}
	}
	public class Public_Inner
	{
		class Inner_Inner{
			
		}
	}
}
class Outer2 {
	void m(){
		Inner i = new Inner();
	}
	public class Inner{	}
}
class Derived extends Outer2{
	public void m()
	{
		Inner i = new Inner();
	}
}

class E3{}
class D3{}
class Outer3{
	class Inner1 extends E3{}
	class Inner2 extends D3{}
	
}

interface Data{
	int get_number();
}
class X1 implements Data
{
	public int get_number(){ return 5;}
}
class O{
	void method(){
		Data x = new Data(){
			public int get_number(){ 
				m();
				return 5;
			}
			public void m(){}
		};
		Data y = new Data(){
			public int get_number(){ return 10;}
		};
		System.out.println(x.get_number());
		// x.m();
		System.out.println(y.get_number());
	}	
}
class DataClass{
	int get_number(){return -3;}
}
 class NewDataClass extends DataClass{
	public int get_number(){ 
		return 5;
	}
}
class O2{
	void method(){
		DataClass x = new DataClass(){
			public int get_number(){ 
				return 5;
			}
		};
		DataClass y = new DataClass();
		NewDataClass z = new NewDataClass();
		System.out.println(x.get_number());
		System.out.println(y.get_number());
	}	
}
class A5{
	{
		System.out.println("x");
	}
	static {
		System.out.println("y");
	}
	public A5(){
		new B5();
	}
	static class B5{
		{
			System.out.println("z");
		}
		static {
			System.out.println("w");
		}
	}
}
class A6 {
	class B6 extends A6{
	}
}
class A7 {
	class B7 { 	}
	class C7 extends B7{}
	void m()
	{
		class inner_class_in_a_method{
			
		}
	}
	void m2(){
		//inner_class_in_a_method x = new inner_class_in_a_method();
	}
}






public class InnerClass {
	public static void main(String[] args) {
		A5  a = new A5();
		System.out.println("----");
		A5.B5 b = new A5.B5();
		System.out.println("----");
		A5  a2 = new A5();
		System.out.println("----");
		G  a3 = new G();
		a3.m();
		
		//new O2().method();
		//new O().method();
		/*	Outer o = new Outer();
		Outer.Public_Inner p_i = o.new Public_Inner();
		Outer.Public_Inner.Inner_Inner  p_i_i = p_i.new Inner_Inner();
		
		
		Outer.Static_Inner osi = new Outer.Static_Inner();
		Outer.Static_Inner.inner_method();
		osi.inner_method();
		//Public_Inner p  = new Public_Inner();
		
		/*G2 g =  new G2();
		System.out.println(g.s);
		/*	G g = new G();
		System.out.println(g.m());
		E e = g;
		System.out.println(e.s);*/
	}

}
















