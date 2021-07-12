package com.beidgelibz.linklistprograms;

public class LinkListUc5 {
	public ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			LinkListUc5 list = new LinkListUc5();

			list.head = new ListNode(50);
			ListNode secondNode = new ListNode(70);
			ListNode thirdNode = new ListNode(30);
			list.head.next = secondNode;
			secondNode.next = thirdNode;
			list.print();
			list.pop(secondNode, list);
		}
	}

	private void pop(ListNode node, LinkListUc5 list) {
		list.head = node;
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