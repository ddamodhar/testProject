package lambdaExpressionExample1;

import java.util.ArrayList;
import java.util.List;

public class ListIterationUsingLamdaExpression {

	public static void main(String[] args) {
		List<Integer> listNumbers = new ArrayList<Integer>();
		listNumbers.add(1);
		listNumbers.add(2);
		listNumbers.add(3);
		listNumbers.add(4);
		listNumbers.add(5);
		listNumbers.add(6);
		listNumbers.add(7);

		listNumbers.forEach(i -> System.out.println(i));
	}
}
