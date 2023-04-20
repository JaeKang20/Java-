package practice;

import java.util.ArrayList;
import java.util.List;

public class MyGenericClassRunner {

	public static void main(String[] args) {
		List<Number> nice = new ArrayList<>(List.of(3, 2));
		MyGenericClass<Number> list = new MyGenericClass<>(nice);
		list.addElement(10);
		list.addElement(3.2);
		System.out.println(list.toString());

	}

}
