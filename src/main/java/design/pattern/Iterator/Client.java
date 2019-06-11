package design.pattern.Iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Client {

    public static void main(String[] args) {
        /*List<Student> studentList = new ArrayList<Student>();*/
        StudentList<Student> studentList = new StudentList<Student>();
        for(int i = 10; i < 20; i++) {
            studentList.add(new Student(i));
            studentList.add(new Student(i));
        }
        
        ListIterator<Student> studentIterator = studentList.listIterator();

        System.out.println("_______________");
        
        while(studentIterator.hasNext()) {
            Student student = studentIterator.next();
            System.out.println(student.age);
            studentIterator.remove();
        }
    }

}
