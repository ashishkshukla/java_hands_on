package oop.interfaces;

public interface B {
	public void methodB();
	
	public default void defaultMethodB() {
		System.out.println("Interface B : defaultMethodB");
	}
	
	public default void defaultMethod() {
		System.out.println("Interface B : defaultMethod");
	}
	
}
