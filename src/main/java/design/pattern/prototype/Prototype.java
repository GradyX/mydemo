package design.pattern.prototype;

public interface Prototype {

    public Prototype shallowClone();
    
    public Prototype deepClone() throws Exception;
    
}
