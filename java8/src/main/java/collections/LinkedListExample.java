package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedListExample {
public static void main(String[] args) {
	Set<String> order =  new HashSet<String>();
	order.add("a");
	order.add("b");
	order.add("c");
	order.add("d");
	order.add("e");
	order.add(null);
	order.add(null);
	
	order.forEach(i -> System.out.println(i));
	
	System.out.println("_____________-");
	Set<String> order1 =  new LinkedHashSet<String>();
	order1.add("a");
	order1.add("b");
	order1.add("c");
	order1.add("d");
	order1.add("e");
	order1.add(null);
	order1.add(null);
	
	order.forEach(i -> System.out.println(i));
	
}
}
