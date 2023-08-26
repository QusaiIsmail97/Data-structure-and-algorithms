package linkedlist;
public class linkedlist {
	private class Node {
		int data;
		Node Referance;

		Node(int data) {
			this.data = data;
			Referance = null;

		}
	}

	private Node head;

	void insert(int value) {
		Node newnode = new Node(value);

		if (head == null) {
			head = newnode;
		} else {
			Node i = head;
			while (i.Referance != null) {
				i = i.Referance;
			}
			i.Referance = newnode;

		}

	}

	void print() {
		Node i = head;
		System.out.print("head" + "--->");
		while (i != null) {
			System.out.print(i.data + "--->");
			i = i.Referance;
		}
		System.out.print("Null" + '\n');

	}

	// This function utilizing to retrieve data
	int get(int pos) {
		Node i = head;
		if (pos == 0) {
			return head.data;
		} else {
			for (int j = 1; j <= pos; j++) {
				i = i.Referance;
			}
			return i.data;

		}

	}

	// This function utilizing to modify data
	void modify(int pos, int newvalue) {
		Node i = head;
		if (pos == 0) {
			head.data = newvalue;
		} else {
			for (int j = 1; j <= pos; j++) {
				i = i.Referance;
			}
			i.data = newvalue;

		}

	}

	// This function utilizing to insert data in anywhere in linked list
	void insert(int value, int pos) {
		Node i = head;
		Node newnode = new Node(value);
		if (pos == 0) {
			newnode.Referance = head;
			head = newnode;
		} else {
			for (int j = 1; j < pos; j++) {
				i = i.Referance;

			}
			newnode.Referance = i.Referance;
			i.Referance = newnode;

		}

	}

	// This function utilizing to remove data in anywhere in linked list
	void remove(int p) {
		
		
		
		if(p == 0) {
			Node oldnode = head;
			head = head.Referance;
			oldnode.Referance = null;
		}
		else {
			//traverse
			Node i = head;
			for(int j = 1; j < p; j++) {
				i = i.Referance;
			}
			Node oldnode = i.Referance;
			i.Referance = oldnode.Referance;
			oldnode.Referance = null;
		}
			
		}

	boolean isempty() {
		if (head == null) {
			return true;
		} else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Linked List Is empty or Not");
		linkedlist linkedlist1 = new linkedlist();
		System.out.println(linkedlist1.isempty());
		linkedlist1.insert(5);
		linkedlist1.insert(6);
		linkedlist1.insert(10);
		linkedlist1.insert(100);

		linkedlist1.insert(4, 0);
		linkedlist1.insert(50, 2);
		System.out.println("The Linked List Before Modify");
		linkedlist1.print();
		System.out.println("The Linked List After Modify");

		linkedlist1.modify(1, 10);

		linkedlist1.print();
		System.out.println("The Linked List After remove");

		linkedlist1.remove(4);
		linkedlist1.print();

	}

}
