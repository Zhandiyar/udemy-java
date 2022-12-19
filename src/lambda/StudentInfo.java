package lambda;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, Predicate<Student> pr){
        for(Student s: al){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
//    void printStudentsOverGrade(ArrayList<Student> al, double grade){
//        for(Student s : al){
//            if(s.avgGrade>grade){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsUnderAge(ArrayList<Student> al, int age){
//        for(Student s : al){
//            if(s.age<age){
//                System.out.println(s);
//            }
//        }
//    }
//    void printStudentsMixCondition(ArrayList<Student> al,int age, double grade, char sex){
//        for(Student s : al){
//            if(s.age>age && s.avgGrade<grade && s.sex==sex){
//                System.out.println(s);
//            }
//        }
//    }
}
class Test {
       public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm',22,3,8.3);
    Student st2 = new Student("Nikolay", 'm',28,2,6.4);
    Student st3 = new Student("Elena", 'f',19,1,8.9);
    Student st4 = new Student("Petr", 'm',35,4,7);
    Student st5 = new Student("Mariya", 'f',23,3,9.1);
    ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

    StudentInfo info = new StudentInfo();
//           Collections.sort(students, new Comparator<Student>() {
//               @Override
//               public int compare(Student s1, Student s2) {
//                   return s1.course-s2.course;
//               }
//           });

           Collections.sort(students, (stud1,stud2) -> stud1.course- stud2.course);
           System.out.println(students);




//    info.testStudents(students, new CheckOverGrade());
//           System.out.println("------------------------");
//    info.testStudents(students, new StudentChecks() {
//        @Override
//        public boolean check(Student s) {
//            return s.age<30;
//        }
//    });
//           info.testStudents(students,(Student s) -> {return s.avgGrade>8;});
           info.testStudents(students,s-> s.avgGrade>8);
           System.out.println("------------------------");
//           info.testStudents(students,(Student s) -> { return s.age<30;} );
           info.testStudents(students, s -> {
               System.out.println("hello");
               return s.age<30;
           } );

//           StudentChecks sc = s ->  s.avgGrade > 8;
//           info.testStudents(students, sc);
           System.out.println("------------------------");

           Predicate<Student> p1 = s->s.avgGrade>8;
           Predicate<Student> p2 = s->s.sex=='m';

           info.testStudents(students,p1.negate());


           System.out.println("------------------------");
           info.testStudents(students,(Student s) ->
           { return s.age>20&& s.avgGrade<9.3&&s.sex=='f';} );


           System.out.println("------------------------");

      //     Function<Student, Double> f = student -> student.avgGrade;
           double res = avgOfSmth(students, stud ->(double)stud.course);
           double res2 = avgOfSmth(students, s-> s.avgGrade);
           double res3 = avgOfSmth(students, p-> (double)p.age);

           System.out.println(avgOfSmth(students, stud ->(double)stud.course));
           System.out.println(res2);
           System.out.println(res3);


//        info.printStudentsOverGrade(students,8);
//        System.out.println("------------------------------");
//        info.printStudentsUnderAge(students,30);
//        System.out.println("------------------------------");
//        info.printStudentsMixCondition(students,20,9.5,'f');

        }
    private static double avgOfSmth(List<Student> list, Function<Student, Double> f){
           double result = 0;
           for (Student st: list){
               result += f.apply(st);
           }
           result = result/list.size();
           return result;
    }

}

//    interface StudentChecks{
//    boolean check(Student s);
//    }

//
//    class CheckOverGrade implements StudentChecks{
//
//        @Override
//        public boolean check(Student s) {
//            return s.avgGrade>8;
//        }
//    }

