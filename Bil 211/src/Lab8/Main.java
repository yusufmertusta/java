package Lab8;

import java.util.*;

public class Main {
  static Random rnd;

  public static String getRandomChar() {
    return ("" + (char)('a' + rnd.nextInt(26))).toUpperCase();
  }
  public static void main(String[] args) {
    rnd = new Random();
    rnd.setSeed(Integer.parseInt(args[1]));
    LinkedList < String > list1 = new LinkedList < String > ();
    list1.add(getRandomChar());
    list1.add(getRandomChar());
    list1.add(getRandomChar());
    list1.add(getRandomChar());
    list1.add(getRandomChar());

    LinkedList < String > list2 = new LinkedList < String > ();

    list2.add(getRandomChar());
    list2.add(getRandomChar());
    list2.add(getRandomChar());
    list2.add(getRandomChar());
    list2.add(getRandomChar());
    
    System.out.println("list1 : " + list1);
    System.out.println("list2 : " + list2);

    int mode = Integer.parseInt(args[0]);
    if (mode == 0) {
      LinkedList < String > birlesim = Kume.birlesim(list1, list2);
      System.out.println(birlesim);
    } else if (mode == 1) {
      LinkedList < String > kesisim = Kume.kesisim(list1, list2);
      System.out.println(kesisim);
    } else if (mode == 2) {
      LinkedList < String > fark = Kume.fark(list1, list2);
      System.out.println(fark);
    } else {
      list1.add(list1.getFirst());
      list1.add(list2.getLast());
      LinkedList < String > kopyaKaldir = Kume.kopyaKaldir(list1);
      System.out.println(kopyaKaldir);
    }
  }
}