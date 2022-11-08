package com.corejava;

import java.util.ArrayList;
import java.util.List;
 
class FirstClass extends Book{

	public static void myMethod(int a) {
		System.out.println("My Number is :" + a * a);
	}

	public static void main(String[] args) {

		List<Book> list = new ArrayList<>();
		list.add(new Book("ABC", 101, "Yogesh"));
		list.add(new Book("XYZ", 102, "Mangesh"));
		list.add(new Book("LMN", 103, "Kamlesh"));
		list.add(new Book("PQR", 104, "Chandu"));

		System.out.println(list);

		for (Book book : list) {

			String s = book.getBookAuther();
			System.out.println(s);

			Integer in = book.getBookId();
			System.out.println(in);
		}

		FirstClass first = new FirstClass();

		FirstClass.myMethod(12);
		
		first.getBookName();
		
		

	}

}
