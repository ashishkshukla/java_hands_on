package oop.interfaces;

public class InterfaceTest {
	public static void main(String[] args) {
		A objA = new X();
		objA.methodA();

		// default method
		objA.defaultMethodA();

		B objB = new X();
		objB.methodB();
		// default method overridden
		objB.defaultMethodB();

		// must override if interfaces have common default method
		objB.defaultMethod();

		M objM = new Y();
		// if abstract class has the same concrete method as interface, no need to
		// implement in concrete class
		objM.commonMethod();

		// static method call- via Class name only not with object reference
		A.staticMethod();

		// X.staticMethod(); it wont work as static method in interfaces will not by
		// inherited by classes which implements
	}
}
