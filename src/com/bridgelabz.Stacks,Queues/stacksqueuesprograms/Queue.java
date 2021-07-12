package com.bridgelabz.stacksqueuesprograms;

public class Queue {
	Node front;
	Node rear;
	int length;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Stack and Queue Problem....!!!");
		Queue queue = new Queue();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		queue.print();
	}

	// add data into the Queue
	public void enQueue(int data) {
		if (front == null) {
			rear = new Node(data);
			front = rear;
		} else {
			rear.next = new Node(data);
			rear = rear.next;
		}
		length++;

	}

	// Print method
	public void print() {
		Node temp = front;
		while (temp != null) {
			System.out.print(temp.data + "-> ");
			temp = temp.next;
		}
	}

}
