package Soru3;

/*1*/ interface Inter {
	/* 2 */ default void c() {
		/* 3 */ System.out.println("c");
		/* 4 */ }

	/* 5 */ public int get();
	/* 6 */ }
		

/* 7 */ abstract class TheClass implements Inter {
	/* 8 */ public int get() {
		/* 9 */ return 5;
		/* 10 */ }

	/* 11 */ public static int value() {
		/* 12 */ return 3;
		/* 13 */ }

	/* 14 */ public static String as() {
		/* 15 */ System.out.println("a");
		return "a";
		/* 16 */ }
	/* 17 */ }

/* 18 */ class Final {
	/* 19 */ public static void main(String[] args) {
		/* 20 */ Inter i = new TheClass() {
			/* 21 */ public void c() {
				/* 22 */ as();
				/* 23 */ }
			/* 24 */ };
		/* 25 */ Inter x = TheClass::value;
		/* 26 */ Inter v = TheClass::as;
			System.out.println(x.get());
			x.c();
		/* 27 */ }
	/* 28 */ }