package method;

public class MethodVarArgs {

	public static void main(String[] args) {
		callMethod(0, "ashish", "shukla");
	}

	public static void callMethod(int a, String... stringSet) {
		System.out.println(stringSet.length);
		System.out.print(stringSet[1]);
	}
}
