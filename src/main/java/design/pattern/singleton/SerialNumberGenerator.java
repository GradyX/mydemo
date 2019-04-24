package design.pattern.singleton;

//Ioc方式
public class SerialNumberGenerator {
    
    private long serialNumber = 0;
    
    private SerialNumberGenerator() {
        
    }
    
    private static class InnerHolder {
        private static final SerialNumberGenerator serialNumberGenerator = new SerialNumberGenerator();
    }
    
    public static SerialNumberGenerator getSerialNumberGenerator() {
        return InnerHolder.serialNumberGenerator;
    }
    
    public long getNewSerialNumber() {
        
        return serialNumber++;
        
    }
    
}

//恶汉式
class EagerSerialNumberGenerator {
    
    private static EagerSerialNumberGenerator serialNumberGenerator = new EagerSerialNumberGenerator();
    
    private EagerSerialNumberGenerator() {
        
    }
    
    public static EagerSerialNumberGenerator getSerialNumberGenerator() {
        return serialNumberGenerator;
    }
    
    private long serialNumber = 0;
    
    public long getNewSerialNumber() {
        
        return serialNumber++;
        
    }
    
}
//懒汉式 如果getSerialNumberGenerator不用synchronized修饰，需要双重检查锁定才可以不因为多线程获取单例对象而出现线程不安全的错误
class LazySerialNumberGenerator {
    
    private volatile static LazySerialNumberGenerator serialNumberGenerator;
    
    private LazySerialNumberGenerator() {
        
    }
    
    public static LazySerialNumberGenerator getSerialNumberGenerator() {
        if(serialNumberGenerator == null) {
            synchronized(LazySerialNumberGenerator.class) {
                if(serialNumberGenerator == null) {
                    serialNumberGenerator = new LazySerialNumberGenerator();
                }
            }
        }
        return serialNumberGenerator;
    }
    
    private long serialNumber = 0;
    
    public long getNewSerialNumber() {
        
        return serialNumber++;
        
    }
    
}
//枚举实现