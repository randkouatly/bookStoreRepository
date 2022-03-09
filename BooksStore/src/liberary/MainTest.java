package liberary;

import items.Book;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book("Harry Poter", 23.9);
		Book book2 = new Book("Thunder Storm", 122.6);
		Book book3 = new Book("Harry poter", 82.6);
		 
		
		book1.printInfo();
		book2.printInfo();
		book3.printInfo();
		

	}

}
