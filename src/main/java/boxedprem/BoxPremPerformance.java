package boxedprem;

public class BoxPremPerformance {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		primitiveSum();
		long endTime = System.currentTimeMillis();
		System.out.println("time taken in primitive calculation " + (endTime - startTime) + " milliseconds");

		startTime = System.currentTimeMillis();
		boxedPrimitiveSum();
		endTime = System.currentTimeMillis();
		System.out.println("time taken in primitive calculation " + (endTime - startTime) + " milliseconds");

		/*
		 * boxedPrimitiveSum will take more time as compare to primitive sum.The reason
		 * is that arithmetic calculations over boxed primitives involves unboxing ,
		 * operation and boxing with each operation and each interation.So it is
		 * advisable to use primitive types over boxed primitives.
		 */
	}

	public static void primitiveSum() {
		long sum = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void boxedPrimitiveSum() {
		Long sum = 0l;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
