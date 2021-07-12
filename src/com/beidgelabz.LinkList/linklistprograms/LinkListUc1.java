package com.beidgelibz.linklistprograms;

public class LinkListUc1 {
	public ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			LinkListUc1 list = new LinkListUc1();
			list.head = new ListNode(56);
			list.head.next = new ListNode(30);
			list.head.next.next = new ListNode(70);

		}
	}
}
