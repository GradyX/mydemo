package design.pattern.prototype;

import java.util.HashMap;

public class Client {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Levis");
        customer.setAge(21);
        customer.setSex('M');
        Customer cloneCustomer = (Customer)customer.shallowClone();
        Customer deepCloneCustomer = null;
        try {
            deepCloneCustomer = (Customer)customer.deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("customer == cloneCustomer : " + (customer == cloneCustomer));
        System.out.println("customer == deepCloneCustomer : " + (customer == deepCloneCustomer));
        cloneCustomer.setName("Lucy");
        cloneCustomer.setSex('F');
        System.out.println(customer);
        System.out.println(cloneCustomer);
        System.out.println(deepCloneCustomer);
    }

}

class PrototypeManager {
    
    private HashMap<String, Prototype> prototypeMap = new HashMap<String, Prototype>();
    
    private static PrototypeManager prototypeManager = new PrototypeManager();
    
    private PrototypeManager() {
        prototypeMap.put("customer", new Customer());
    }
    
    public void addPrototype(String prototypeType, Prototype prototype) {
        prototypeManager.prototypeMap.put(prototypeType, prototype);
    }
    
    public static Prototype getPrototype(String prototypeType) {
        return prototypeManager.prototypeMap.get(prototypeType).shallowClone();
    }
    
}
