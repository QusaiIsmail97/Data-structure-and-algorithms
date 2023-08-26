package stackusedlist;

public class stack {
	int stack[];
	int end;
	int maxsize;

	public stack() {
		maxsize = 2;
		end = -1;
		stack = new int[maxsize];

	}

	boolean isFull() {
		if (end == maxsize - 1)
			return true;
		return false;
	}

	boolean isempty() {
		if (end == -1)
			return true;
		return false;
	}

	void push(int value) {
		if (isFull()) {
			inccapacity(value);
		} else
			stack[++end] = value;

	}

	void pop() {
		if (isempty()) {
			System.out.println("The stack is empty");
		} else
			end--;
	}

	int gettop() {
		return stack[end];

	}
	void print()
	{System.out.println("The stack is");
		for(int i=end;i<=end;i--)
		{  if(i==-1)
			break;
		else
		   System.out.print(stack[i]+" ");
			
		}
	}

	void inccapacity(int value) {
		int stack2[] = new int[maxsize=maxsize * 2];
		for (int i = 0; i <= end; i++)
			stack2[i] = stack[i];
		stack = stack2;
		stack[++end] = value;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack st1 = new stack();
		st1.push(4);
		st1.push(5);
		st1.push(6);
		st1.push(7);
		st1.push(10);
		st1.push(11);
		st1.push(12);
		st1.push(13);

	

		
		st1.print();

	}

}
