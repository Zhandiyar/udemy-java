package LinkedList;

import java.util.LinkedList;

public class LinkendListEx1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Ivan", 3);
        Student2 st2 = new Student2("Nikolay", 2);
        Student2 st3 = new Student2("Elena", 1);
        Student2 st4 = new Student2("Petr", 4);
        Student2 st5 = new Student2("Mariya", 3);
        LinkedList<Student2> list = new LinkedList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        System.out.println("Linkedlist  = " + list);
        System.out.println(list.get(2));
        Student2 st6 = new Student2("Zaur", 3);
        Student2 st7 = new Student2("Igor", 4);
        list.add(st6);
        list.add(1, st7);
        System.out.println("Linkedlist  = " + list);

    }
}
class Student2{
       private String name;
       private int course;

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }


}
