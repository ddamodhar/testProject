package lambdaExpressionExample1;

public class Java8Tester {
	
	public static void main(String[] args) {
		MathOperation addition = (int a, int b) -> {
		return	a + b;
		};
		System.out.println(addition.operation(5, 3));
	}

}
