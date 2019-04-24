package design.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Customer implements Serializable, Prototype{

    private static final long serialVersionUID = -9068182317517749350L;

    private String name;
    private char sex;
    private int age;
    private Address address;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Prototype shallowClone() {
        Customer customer = new Customer();
        customer.name = this.name;
        customer.sex = this.sex;
        customer.age = this.age;
        customer.address = this.address;
        return customer;
    }
    
    public Prototype deepClone() throws Exception {
        Customer customer = null;
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(this);
        out.flush();
        out.close();
        ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bin);
        customer = (Customer)in.readObject();
        in.close();
        return customer;
    }
    
    public String toString() {
        return this.name + " is a " + (this.sex == 'M' ? "man, he is " : "woman, she is ") + this.age + " old" ;
    }
    
}
