package com.beidgelibz.linklistprograms;

public class LinkListUc9 {
	public ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			LinkListUc9 list = new LinkListUc9();
			list.head = new ListNode(56);
			ListNode secondNode = new ListNode(70);
			ListNode thirdNode = new ListNode(30);
			list.head.next = secondNode;
			secondNode.next = thirdNode;
			list.print();
			search(list, 30);
			list.insert(40, 30);
			list.print();
			list.delete(40);
			list.print();
		}

		private static void search(LinkListUc9 list, int data) {
			ListNode currentNode = list.head, previousNode = null;
			while (currentNode != null && currentNode.data != data) {
				currentNode = currentNode.next;
			}
		}

	}

	private void delete(int whatToDelete) {
		ListNode currentNode = head, previousNode = null;
		while (currentNode != null && currentNode.data != whatToDelete) {
			previousNode = currentNode;
			currentNode = currentNode.next;

		}
		if (currentNode != null) {
			System.out.println(whatToDelete + "node deleted");
			previousNode.next = currentNode.next;
		}
	}

	private void insert(int whatToInsert, int afterWhatToInsert) {
		ListNode currentNode = head;
		while (currentNode != null && currentNode.data != afterWhatToInsert) {
			currentNode = currentNode.next;
		}
		currentNode.next = new ListNode(40);
	}

	private void pop(ListNode node, LinkListUc9 list) {
		ListNode courser = head;
		System.out.println("after removing head node from link list.");

	}

	private void print() {
		ListNode pointer = head;
		while (pointer != null) {
			System.out.print(pointer.data + "->");
			pointer = pointer.next;
		}
		System.out.println("null");
	}
}
