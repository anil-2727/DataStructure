package com.beidgelibz.linklistprograms;

public class LinkListUc8 {
	public ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			LinkListUc8 list = new LinkListUc8();
			list.head = new ListNode(56);
			ListNode secondNode = new ListNode(30);
			ListNode thirdNode = new ListNode(40);
			ListNode fourthNode = new ListNode(70);
			list.head.next = secondNode;
			secondNode.next = thirdNode;
			thirdNode.next = fourthNode;
			list.print();

		}
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
