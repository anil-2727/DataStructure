package com.beidgelibz.linklistprograms;

public class LinkListUc7 {
	public ListNode head;

	public static class ListNode {
		public int data;
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}

		public static void main(String[] args) {
			LinkListUc7 list = new LinkListUc7();

			list.head = new ListNode(56);
			ListNode secondNode = new ListNode(70);
			ListNode thirdNode = new ListNode(30);
			list.head.next = secondNode;
			secondNode.next = thirdNode;
			list.print();
			search(list, 30);
		}

		private static void search(LinkListUc7 list, int data) {
			ListNode currentNode = list.head, previousNode = null;

			while (currentNode != null && currentNode.data != data) {
				currentNode = currentNode.next;
			}
			System.out.println("node is found with data 30 :: " + currentNode.data);
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
