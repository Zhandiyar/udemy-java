package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

//        ArrayList.ArrayList <String> arraylist1 =new ArrayList.ArrayList<>();
//        arraylist1.add("Zaur");
//        arraylist1.add("Ivan");
//        arraylist1.add("Marriya");
//        arraylist1.add(1,"Misha");
//        for(String s:arraylist1){
//            System.out.print(s + " ");
//        }
//        System.out.println();
//        ArrayList.ArrayList <Integer> arraylist2 =new ArrayList.ArrayList<>();
//        for(int i = 0; i<arraylist1.size();i++ ){
//            System.out.println(arraylist1.get(i));
//        }
//        System.out.println(arraylist1.get(2));
//        arraylist1.set(1, "fdvdfv");
//        arraylist1.remove(0);
//        System.out.println(arraylist1);

    ArrayList <String> arraylist2 =new ArrayList<>();
      arraylist2.add("Zaur");
        arraylist2.add("Ivan");
        arraylist2.add("Marriya");
        arraylist2.add("Igor");
        arraylist2.add("sdsdddd");
        Object [] array = arraylist2.toArray();
        String [] array2 = arraylist2.toArray(new String[0]);

        for(String s: array2){
            System.out.println(s);
        }
//        List<String> myList = arraylist2.subList(1,3);
//        System.out.println(myList);
//        myList.add("Fedor");
//        System.out.println(myList);
//        System.out.println(arraylist2);;

        List <Integer> list1 = List.of(3,8,13);
        System.out.println(list1);

        List <String> list2 = List.copyOf(arraylist2);
        System.out.println(list2);


    }
}