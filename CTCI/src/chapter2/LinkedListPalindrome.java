/**
 * 
 */
package chapter2;

import chapter2.SinglyLinkedList.LinkedList;
import chapter2.SinglyLinkedList.Node;

/**
 * @author blessonm
 *
 */
public class LinkedListPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(new int[] {1,2,3,4,3,2,1});
		System.out.println(isPalindrome(list.getHead(), listLength(list)).result);		
	}
	
	public static class Result {
		Node node;
		Boolean result;
		
		public Result(Node node, Boolean result){
			this.node = node;
			this.result = result;
		}
	}
	
	public static int listLength(LinkedList list){
		Node node = list.getHead();
		if(list.getHead() == null)
			return 0;
		int l = 1;
		while(node.getNext() != null){
			l++;
			node = node.getNext();
		}
		return l;
	}
	
	public static Result isPalindrome(Node head, int length){
		if(length <= 0){
			return new Result(head, true);
		}
		else if(length == 1){
			return new Result(head.getNext(), true);
		}
		Result res = isPalindrome(head.getNext(), length - 2);
		if(!res.result)
			return res;
		if(res.node.getData() == head.getData())
			res.result = true;
		else
			res.result = false;
		res.node = res.node.getNext();
		return res; 
	}

}
