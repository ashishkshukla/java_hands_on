package jvm;

public class Employee {
	public int id;
	public String name;
	public int age;
	public String dept;
	public double salary;

	public Employee(int id, String name, int age, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.salary = salary;
	}

	public Employee() {

	}

	public boolean increaseSalary(double amount) {
		this.salary = this.salary + amount;
		System.out.println("salary increased by "+amount);
		return true;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
