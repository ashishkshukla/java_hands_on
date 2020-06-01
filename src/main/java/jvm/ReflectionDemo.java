package jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
	public static void main(String[] args) {
		try {
			playWithReflection(Class.forName("jvm.Employee"));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void playWithReflection(Class clazz) throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		System.out.println(clazz.getName());
		System.out.println(clazz.isInterface());

		for (Method m : clazz.getMethods()) {
			System.out.println("Method - " + m.getName());
		}

		// get constructor
		@SuppressWarnings("unchecked")
		Constructor<Employee> empConstructor = clazz.getConstructor(int.class, String.class, int.class, String.class,
				double.class);

		// create new instace with help of constructor
		Employee employee = empConstructor.newInstance(1, "ashish", 30, "dept", 100000);

		System.out.println("employee salary - " + employee.getSalary());

		// get increasesalary method
		Method m = clazz.getMethod("increaseSalary", double.class);

		// call the method
		m.invoke(employee, 3222);

		System.out.println("employee increased salary - " + employee.getSalary());
	}
}
