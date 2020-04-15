package operator;

public class BitwiseOperator {
	public static void main(String[] args) {
		int a = 1;
		int b = 4;
		System.out.println(bitOr(a, b));
		System.out.println(bitAnd(a, b));
		System.out.println(bitXor(a, b));
	}

	public static int bitOr(int a, int b) {
		// a=1 => 001
		// b=4 => 100
		// a|b => 101=>5
		return a | b;
	}

	public static int bitAnd(int a, int b) {
		// a=1 => 001
		// b=4 => 100
		// a&b => 000=>0
		return a & b;
	}

	public static int bitXor(int a, int b) {
		
		// a=1 => 001
		// b=4 => 100
		// a^b => 101=>5
		return a ^ b;

	}
}
