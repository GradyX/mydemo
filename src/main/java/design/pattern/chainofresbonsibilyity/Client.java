package design.pattern.chainofresbonsibilyity;

public class Client {

    public static void main(String []args) {
        Approver approvers = new Director();
        Approver manager = new Manager();
        approvers.setSuperior(manager);
        Approver president = new President();
        manager.setSuperior(president);
    }
    
}
