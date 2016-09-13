package chapter2;

import chapter2.SinglyLinkedList.Node;

public class RecursiveKthToLast {
	
	static int counter = 0;

	public static String findkth(Node head, int k){
		if(head.getNext() == null)
			return null;
		
		counter = Integer.parseInt(findkth(head.getNext(), k) + 1);
		
		if(counter == k)
			return head.getData();
		return null;
	}
}
