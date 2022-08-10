package Lab7;

public class Main
{
	public static void main(String[] args) {
		Duo duo = new Duo("first", 2);
		String first = ""+duo.former();  //first object
		String second = ""+duo.latter(); //second object
		System.out.println(first + " " + second);

		Duo doduo = new Duo(0.0002, 1024);
		doduo.swap_places();
		double result = (int)doduo.former() * (double)doduo.latter(); 
		System.out.println(result);

		Duo dodrio = new Duo(1, '.');
		String str = dodrio.concat(); //returns the String value of the objects concatted
		System.out.println(str);

		Duo trio = new Duo(" Peck", dodrio);
		trio.swap_places();
		System.out.println(trio.concat());
	}
}