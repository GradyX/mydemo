package design.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {

	public static void main(String []args) {
		Subject subject = new RealSubject();
		MyInvocationHandler handler = new MyInvocationHandler();
		handler.obj = subject;
		Subject proxySubject = (Subject)Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
		proxySubject.subject();
	}
	
}


//动态代理

class A {
	
	public void a() {
		System.out.println("a method");
	}

	public void b() {
		System.out.println("b method");
	}
	
}

interface Subject {
	public void subject();
}

class RealSubject implements Subject {

	public void subject() {
		// TODO Auto-generated method stub
		System.out.println("Real subject");
	}
	
}

class MyInvocationHandler implements InvocationHandler {
	
	public Object obj;

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		A a = new A();
		a.a();
		Object obj = method.invoke(this.obj, args);
		a.b();
		return obj;
	}
	
}