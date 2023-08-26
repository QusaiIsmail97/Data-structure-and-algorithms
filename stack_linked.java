package stackusedlinkedlist;

public class stack {
	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	boolean IsEmpty() {
		if (head == null)
			return true;
		return false;
	}

	void push(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}

	}

	void pop() {
		if (IsEmpty()) {
			System.out.println("The stack is empty");
		} else
			head = head.next;

	}

	int gettop() {
		if (IsEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else
			return head.data;
	}

	void print() {
		Node i = head;
		System.out.println("The stack elements is ");
		while (i != null) {
			System.out.print(i.data + " ");
			i = i.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st1=new stack();
		st1.push(5);
		st1.push(8);
		st1.push(10);
		st1.print();

	}

}
