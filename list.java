package list;

public class list {

	int maxSize;
	int A[];
	int end;

	list() {

		maxSize = 3;
		A = new int[maxSize];
		end = -1;
	}

	boolean IsEmpty() {
		if (end == -1)
			return true;

		else
			return false;

	}

	boolean isfull() {
		if (end == maxSize - 1)
			return true;
		else
			return false;
	}

	// insert operation
	void insert(int value) {
		if (isfull())
			System.out.println("Can't add element in list Because List Is Full");
		else
			A[++end] = value;

	}

	void insert(int value, int position) {

		// Shift right by9 one starting from end
		if (isfull())
			System.out.println("The List Is Full");
		else	
			for (int i = end; i >= position; i--)
				A[i + 1] = A[i];
			A[position] = value;
			end++;

	}

	void print() {
		for (int i = 0; i <= end; i++) {
			System.out.println(A[i]);
		}
	}

	int get(int position) {
		if(!IsEmpty())
		   return A[position];
	return 0;

	}

	void Modify(int position, int newvalue)
	{
		if(!IsEmpty())
		   A[position] = newvalue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list l1 = new list();

		l1.insert(5);
		l1.insert(6);
		l1.insert(8);
		System.out.println("List Before Modify");

		l1.print();
		l1.insert(4);
		l1.Modify(0, 8);
		System.out.println("********* ******** ******");
		System.out.println("List After Modify");
		l1.print();

		

	}

}
