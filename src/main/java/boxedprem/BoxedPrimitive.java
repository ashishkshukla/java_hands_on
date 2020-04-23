package boxedprem;

public class BoxedPrimitive {
	public static void main(String[] args) {
		besicConcepts();
		comparisonConcepts();
	}

	public static void besicConcepts() {
		Integer i = new Integer(3);
		System.out.println("boxed premitive value " + i.intValue());

		Integer j = 4; // autoboxed. int 4 will be converted to Integer automatically
		System.out.println("autoboxed value " + j); // j will be unboxed and its value will be returned
	}

	public static void comparisonConcepts() {
		Integer i = new Integer(42);
		Integer j = new Integer(42);

		// Below statement will print false as values wont be unboxed and object
		// reference values will be compared.
		System.out.println("i==j => " + (i == j));

		// Below is the correct way of comparing two boxed primitives objects
		System.out.println("i==j => " + (i.intValue() == j.intValue()));

		// in case of < or > unboxing will be done automatically

		i = new Integer(40);
		if (i < j) {
			System.out.println("i is less than j");
		} else {
			System.out.println("i is grater than or equal to  j");
		}

	}
}
