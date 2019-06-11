package design.pattern.Iterator;

import java.io.Serializable;

public class Student implements Serializable{
    
    private static final long serialVersionUID = 2548977053128953519L;

    public Student(int age) {
        this.age = age;
    }

    public int age;
    
    public int getAge(){
        return age;
    }
    
    public String toString() {
        return age + "";
    }
     
}
