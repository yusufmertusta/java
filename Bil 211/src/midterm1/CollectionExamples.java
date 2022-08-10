package midterm1;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionExamples {
    public static void main(String[] args){
        //Collection c = null;
        //c.add(new Object());
        //Set s; //seti torba gibi düþün küme gibi
        //List l; //liste arrayList listeyi extend eder. LÝst bir interface
        //Map<String,Integer> m ;//anahtar kilit ikilisi iki degeri var
        //bir tc numarasýnýn 1 sahibi vardýr ama ayný isimde birden cok ayný isimde insan olabilir
        HashMap<String,Integer>  n = new HashMap<String,Integer>();
        n.put("abc",5);
        n.put("xyz", 10);
        for(String s : n.keySet()){ //her seferinde bir tane anahtarý ver
            System.out.println(s +"\t" + n.get(s));
        }
        n.remove("xyz");
        /*for (Entry<String,Integer> e: n.entrySet()){
            System.out.println(e.getKey() + "\t" + e.getValue()) ;
        }*/
        HashSet<Integer> h = new HashSet<>();
        h.add((3));
        h.add(2);
        h.add(3);
        h.add(6);
        h.add(5);
        Iterator<Integer> iter = h.iterator();
        while (iter.hasNext())
            System.out.println(iter.next());
        iter.remove();;
        iter = h.iterator();
    }

}
class MyCollection <T> extends AbstractCollection<T>{

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

class MySet <T> extends AbstractSet<T>{
    //Abstract set yerine HashSet kullan daha az implement edersin

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
class MyList <T> extends AbstractList<T>{

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
class MyMap <T,V> extends AbstractMap<T,V>{
    //HasMap kullan

    @Override
    public Object put(Object o, Object o2) {
        return null;
    }

    @Override
    public Set<Entry<T, V>> entrySet() {
        return null;
    }
}









