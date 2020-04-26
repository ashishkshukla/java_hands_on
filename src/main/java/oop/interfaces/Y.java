package oop.interfaces;

public class Y extends M implements A, B {

	@Override
	public void methodB() {
		System.out.println("Class Y : method B");
	}

	@Override
	public void methodA() {
		System.out.println("Class Y : Method A");

	}

	@Override
	public void defaultMethod() {
		System.out.println("Class Y : common default method override");
	}

	@Override
	void methodM2() {
		System.out.println("Class Y: abstract method implement");
	}

}
