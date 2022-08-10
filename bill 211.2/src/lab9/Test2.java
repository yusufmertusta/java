package lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class Test2 {
public static void main(String[] args) {
// Consumer to make uppercase every string of a list
Consumer<ArrayList<String> > modify = new Consumer<ArrayList<String> >() {


	@Override
	public void accept(ArrayList<String> t) {
		for (String letter : t) {
            String newValue = letter.toUpperCase();
            t.set(t.indexOf(letter), newValue);
        }
		
	}
	
};
// Consumer to display a list of strings
Consumer<ArrayList<String> > dispList = new Consumer<ArrayList<String>>() {

	@Override
	public void accept(ArrayList<String> t) {
		for(int i=0;i<t.size()-1;i++)
		System.out.print(t.get(i)+" ");
		System.out.println(t.get(3));
		
	}
	
};
ArrayList<String> list = new ArrayList<String>();
list.add("onE");
list.add("tWo");
list.add("three");
list.add("Four");
// GOREV: Listeyi duzenle (modify) ve sonrasinda dispList ile ekrana bas (hint: andThen() kullanabilirsiniz)
// andThen() art arda iki consumer kullanabilmenizi saglar
// Consumer c1 ve c2 icin c1.andThen(c2) ilk olarak c1i daha sonrasinda ise c2yi gerceklestirmenizi saglar
// COZUM BURADA BASLAR
	modify.accept(list);
	dispList.accept(list);
// COZUM BURADA BITER
System.out.println();
}
}
