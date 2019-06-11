package design.pattern.Iterator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class StudentList<E> extends ArrayList<Student> {

    private static final long serialVersionUID = 8602070218270006268L;

    public ListIterator<Student> listIterator() {
        List<Student> list = this.subList(0, this.size());
        list.sort(new Comparator<Student>() {
            
            public int compare(Student o1, Student o2) {
                System.out.println(o1 + " " + o2);
                return -(o1.age - o2.age);
            }
        });
        return list.listIterator();
    }
    
}
