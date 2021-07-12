package com.beidgelibz.linklistprograms;

public class LinkListUc10 {
	private ListNode head;

	public static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		LinkListUc10 list = new LinkListUc10();
		list.head = new ListNode(56);
		ListNode thirdNode = new ListNode(70);
		list.head.next = thirdNode;
		ListNode secondNode = new ListNode(30);
		secondNode.next = thirdNode;
		list.head.next = secondNode;
		list.printLinkedList();
		System.out.println('\n' + "adding node with value 40 in between");
		list.insert(secondNode, thirdNode, 40); // for adding 40 in between
		list.printLinkedList();
		System.out.println('\n' + "Removing node with value 40 from between ::");
		list.pop(secondNode, thirdNode); // for removing node from between
		list.printLinkedList();
		System.out.println('\n' + "Sorting Linkedlist in ascending order ::");
		list.sortList(); // for sorting nodes in ascending order
		list.printLinkedList();
		System.out.println('\n' + "removing first node ");
		list.pop(null, secondNode);
		list.printLinkedList();
		System.out.println('\n' + "removing last node ");
		list.pop(secondNode, null);
		list.printLinkedList();
	}

	public boolean searchValue(int searchValue) {
		ListNode current = head;
		int nodePosition = 1;
		while (current != null) {
			if (current.data == searchValue) {
				System.out.println("Value found at node number ::" + nodePosition);
				return true;
			}
			nodePosition++;
			current = current.next;
		}
		return false;
	}

	public void printLinkedList() {
		ListNode pointer = head;
		while (pointer != null) {
			System.out.print(pointer.data + " ===> ");
			pointer = pointer.next;
		}
		System.out.println("null");
	}

	public void insert(ListNode prevNode, ListNode afterNode, int newValue) {
		ListNode newNode = new ListNode(newValue);
		prevNode.next = newNode;
		newNode.next = afterNode;
	}

	public void pop(ListNode prevNode, ListNode afterNode) {
		if (prevNode == null) { // for removing head
			head = afterNode;
			return;
		} else if (afterNode == null) { // for removing last element
			prevNode.next = null;
			return;
		}
		prevNode.next = afterNode; // for removing node
	}

	public void sortList() {
		// Node current will point to head
		ListNode current = head, index = null;
		int temp;
		if (head == null) {
			return;
		} else {
			while (current != null) {
				index = current.next;
				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;
			}
		}
	}
}
