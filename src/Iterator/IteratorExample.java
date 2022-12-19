package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arraylist1 = new ArrayList<>();
        arraylist1.add("Zaur");
        arraylist1.add("Ivan");
        arraylist1.add("Marriya");
        arraylist1.add("Misha");

        Iterator<String> iterator =arraylist1.iterator();
        while(iterator.hasNext()){
            iterator.next();
            iterator.remove();
//            System.out.println(iterator.next());
        }
        System.out.println(arraylist1);
    }
}
