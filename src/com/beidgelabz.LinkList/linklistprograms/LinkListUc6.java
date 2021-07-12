package com.beidgelibz.linklistprograms;

public class LinkListUc6 {
	public static ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			LinkListUc6 list = new LinkListUc6();
			list.head = new ListNode(56);
			ListNode secondNode = new ListNode(30);
			ListNode thirdNode = new ListNode(70);
			list.head.next = secondNode;
			secondNode.next = thirdNode;
			list.print();
			System.out.println("the deleted data is :" + deletLast().data);
			list.print();
		}

		public static ListNode deletLast() {
			if (head == null || head.next == null) {
				return head;
			}
			ListNode current = head;
			ListNode previous = null;
			while (current.next != null) {
				previous = current;
				current = current.next;
			}
			previous.next = null;
			return current;
		}

	}

	public void print() {
		ListNode pointer = head;
		while (pointer != null) {
			System.out.print(pointer.data + "->");
			pointer = pointer.next;
		}
		System.out.println("null");
	}
}
