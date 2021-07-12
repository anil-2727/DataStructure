package com.beidgelibz.linklistprograms;

public class LinkListUc2 {
	public ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			LinkListUc2 list = new LinkListUc2();
			list.head = new ListNode(70);
			list.head.next = new ListNode(30);
			list.head.next.next = new ListNode(56);
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
