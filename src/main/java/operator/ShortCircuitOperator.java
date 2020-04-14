package operator;

public class ShortCircuitOperator {
	public static void main(String[] args) {
		orOp();
		andOp();
	}

	public static void orOp() {
		boolean istrue = true;
		int[] arr = { 1, 3, 4 };
		// second condition will be checked only if first is false
		// if part will be executed below
		if (istrue || arr[3] == 5) {
			System.out.println("inside if");
		} else {
			System.out.println("inside else");
		}
	}

	public static void andOp() {
		boolean istrue = false;
		int[] arr = { 1, 3, 4 };
		// second condition will be checked only if first is true
		// else part will be executed below
		if (istrue && arr[3] == 5) {
			System.out.println("inside if");
		} else {
			System.out.println("inside else");
		}
	}
}
