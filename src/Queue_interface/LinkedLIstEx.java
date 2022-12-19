package Queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedLIstEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
             queue.add("Zaur");
             queue.add("Oleg");
             queue.add("Ivan");
             queue.add("Mariya");
             queue.add("Aleksandr");
             System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.element());
        System.out.println(queue.poll());



    }
}
