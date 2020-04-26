package oop.interfaces;

public interface A {
	public void methodA();

	public void commonMethod();

	public default void defaultMethodA() {
		System.out.println("Interface A : defaultMethodA");
	}

	public default void defaultMethod() {
		System.out.println("Interface A : defaultMethod");
	}

	public static void staticMethod() {
		System.out.println("Interface A: static Method");
	}
}
