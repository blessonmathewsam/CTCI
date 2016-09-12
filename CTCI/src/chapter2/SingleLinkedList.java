package chapter2;

public class SingleLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode("one");
		list.addNode("two");
		list.addNode("two");
		list.printNodes();
	    System.out.println(list.findNode("two").getData());
		Node n = new Node("three"); 
		list.deleteNode(n);
		list.printNodes();
	}
	
	public static class Node {
		
		String data;
		Node next;
		
		public Node(){
			this.data = "";
			this.next = null;
		}
		
		public Node(String s){
			this.data = s;
			this.next = null;
		}

		public String getData() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
		
	}
	
	public static class LinkedList {
		
		Node head;
		
		public LinkedList(){
			this.head = null;
		}
		
		public LinkedList(Node n){
			this.head = n;
		}
		
		public Node addNode(Node n){
			if(this.head == null){
				this.head = n;
			}
			else{
				Node node = head;
				while(node.next != null){
					node = node.next;
				}
				node.next = n;
				n.next = null;
			}
			return this.head;
		}
		
		public Node addNode(String s){
			Node n = new Node(s);
			return this.addNode(n);
		}
		
		public Node findNode(String s){
			Node n = head;
			if(n.data.equals(s))
				return this.head;
			while(n.next != null){
				if(n.next.data.equals(s))
					return n.next;
				else{
					n = n.next;
				}
			}
			return null;
		}
		
		public Node findNode(Node n){
			return this.findNode(n.getData());
		}
		
		public Node deleteNode(String s){
			Node n = head;
			if(n.data.equals(s)){
				this.head = n.next;
				return this.head;
			}
			while(n.next != null){
				if(n.next.data.equals(s)){
					n.next = n.next.next;
					return head;
				}
				else
					n = n.next;
			}
			return null;
		}
		
		public Node deleteNode(Node n){
			return this.deleteNode(n.data);
		}
		
		public void printNodes() {
			Node n = head;
			while(n.next != null){
				System.out.print(n.data + "->");
				n = n.next;
			}
			System.out.println(n.data);
		}
		
	}

}
