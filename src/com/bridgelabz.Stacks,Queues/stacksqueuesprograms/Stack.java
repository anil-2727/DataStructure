package com.bridgelabz.stacksqueuesprograms;

public class Stack {
	private ListNode top;
	private int length;

	private class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public Stack() {
		top = null;
		length = 0;
	}

	public int getLenght() {
		return length();
	}

	private int length() {
		return 0;
	}

	public boolean isEmpty() {
		return length == 0;
	}

	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		// stack.push(6);
		stack.display(stack);
		System.out.println("stack" + stack);
	}

	private int peek() {
		return top.data;
	}

	public int pop() {
		int result = top.data; // should remove top most element and storing in
								// a variable
		top = top.next;
		length--;
		return result;
	}

	@Override
	public String toString() {
		return "Stack [top=" + top + ", length=" + length + "]";
	}

	public void display(Stack stack) {
		while (!isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}

}
