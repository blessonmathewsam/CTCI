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
public class LinkedListIntersection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList list3 = new LinkedList();
		list1.addNode(new int[] {1,2,3,4,5});
		list2.addNode(new int[] {3,4,5});
		list3.addNode(new int[] {6,7,8,9,10});
		list1.getTail().setNext(list3.getHead());
		list1.setTail(list3.getTail());
		list2.getTail().setNext(list3.getHead());
		list2.setTail(list3.getTail());
		list1.printNodes();
		list2.printNodes();
		System.out.print(intersection(list1, list2).result);
	}
	
	public static Result intersection(LinkedList list1, LinkedList list2){
		if(list1.getTail() != list2.getTail())
			return new Result(new Node(), false);
		LinkedList shorter = listLength(list1) < listLength(list2) ? list1 : list2;
		LinkedList longer = listLength(list1) < listLength(list2) ? list2 : list1;
		int diff = listLength(longer) - listLength(shorter);
		Node node1 = longer.getHead();
		Node node2 = shorter.getHead();
		while(diff > 0){
			node1 = node1.getNext();
			diff--;
		}
		
		if(node1 == node2){
			return new Result(node1, true);
		}
		while(node1.getNext() != null && node2.getNext() != null){
			if(node1.getNext() == node2.getNext())
				return new Result(node1, true);
			node1 = node1.getNext();
			node2 = node2.getNext();
		}
		return new Result(node1, false);
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
	
	public static class Result {
		Node node;
		Boolean result;
		
		public Result(Node node, Boolean result){
			this.node = node;
			this.result = result;
		}
	}

}
