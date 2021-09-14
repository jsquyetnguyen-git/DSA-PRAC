package LinkedList;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		MyList mylist = new MyList();
		mylist.insertToLast(30);
		mylist.insertToLast(20); 
		mylist.insertToLast(10);
		mylist.insertToLast(100);
		mylist.insertToLast(60);
		mylist.insertToLast(50);
		mylist.insertToIndex(5, 6);
		mylist.search(10);
		mylist.traverse();
		mylist.sort();
		
		
	}

}
