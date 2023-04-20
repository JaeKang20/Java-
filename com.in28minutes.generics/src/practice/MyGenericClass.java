package practice;

import java.util.List;

public class MyGenericClass<T> {
	private List<? super T> myList;

	public MyGenericClass(List<? super T> list) {
		this.myList = list;
	}

	public void addElement(T element) {
		myList.add(element);
	}

	@Override
	public String toString() {

		return "" + myList;
	}
}
