package LinkedListObj;

public class Main {

	public static void main(String[] args) {
		People p = new People("Quyet", 20);
		People p1 = new People("Nguyen",21);
		
		MyList mylist = new MyList();
		
		mylist.addToHead(p);
		mylist.addToHead(p1);
		mylist.traverse();

	}

}
