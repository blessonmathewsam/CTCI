package chapter2;

import chapter2.SinglyLinkedList.LinkedList;
import chapter2.SinglyLinkedList.Node;

public class RecursiveKthToLast {
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(new int[] {1,2,3,4,5});
		list.printNodes();
		System.out.println("Kth value is " + findkth(list.getHead(), 2));
	}
	
	public static class Counter {
		public int value;
		
		public Counter(){
			this.value = 0;
		}
	}
	
	public static int findkth(Node head, int k){
		Counter counter = new Counter();
		return findkth(head, k, counter).getData();
	}

	public static Node findkth(Node head, int k, Counter counter){
		if(head == null)
			return null;
		Node n = findkth(head.getNext(), k, counter);	
		counter.value = counter.value + 1;
		if(counter.value == k){
			System.out.println(head.getData());
			return head;
		}
		return n;
	}
}
