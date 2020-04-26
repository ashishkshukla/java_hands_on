package oop.interfaces;

public class X implements A, B {

	@Override
	public void methodB() {
		System.out.println("Class x: MethodB");

	}

	@Override
	public void methodA() {
		System.out.println("Class x: MethodA");

	}

	@Override
	public void defaultMethodB() {
		B.super.defaultMethodB();
		System.out.println("Method Overriden : Class X");
	}
	
    //We have to override if same default method in all the interfaces
	@Override
	public void defaultMethod() {
		System.out.println("Class X : common default method override");
	}

	@Override
	public void commonMethod() {
		System.out.println("Class X : common method override");
		
	}
}
