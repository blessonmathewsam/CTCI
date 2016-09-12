package chapter2;

public class DoubleLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode("one");
		list.addNode("two");
		list.addNode("three");
		list.printNodes();
		list.deleteNode("one"); 
		list.printNodes();
		System.out.println(list.getHead().getData());
		list.printTail();
		System.out.println(list.findNode("one").getData());
	}

	public static class Node {
		
		private String data;
		private Node prev;
		private Node next;
		
		public Node(){
			this.data = "";
			this.prev = null;
			this.next = null;
		}
		
		public Node(String s){
			this.data = s;
			this.prev = null;
			this.next = null;
		}
		
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public Node getPrev() {
			return prev;
		}
		public void setPrev(Node prev) {
			this.prev = prev;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
			
	}
	
	public static class LinkedList {
	
		private Node head;
		private Node tail;
		
		public LinkedList(){
			this.head = null;
			this.tail = null;
		}
		
		public LinkedList(Node head){
			this.head = head;
			this.tail = head;
		}
		
		public LinkedList(Node head, Node tail) {
			this.head = head;
			this.tail = tail;
			this.head.setNext(tail); 
			this.tail.setPrev(head);
		}

		public Node addNode(String s){
			if(this.head == null){
				this.head = new Node(s);
				this.tail = this.head;
				return this.head;
			}
			Node n = new Node(s);
			n.prev = this.tail;
			this.tail.setNext(n);;
			this.tail = n;
			return null;
		}
		
		public Node addNode(Node n){
			return this.addNode(n.getData());
		}
		
		public Node findNode(String s){
			Node n = this.head;
			if(n.getData().equals(s))
				return n;
			while(n.next != null){
				if(n.next.getData().equals(s))
					return n.next;
				else
					n = n.next;
			}
			return new Node("Not found");
		}
		
		public Node findNode(Node n){
			return this.findNode(n.getData());
		}
		
		public Node deleteNode(String s){
			Node n = this.head;
			if(n.getData().equals(s)){
				n.next.setPrev(null);
				this.head = n.next;
				return this.head;
			}
			while(n.next != null){
				if(n.next.getData().equals(s)){
					if(n.next.next == null){
						this.tail = n;
						n.setNext(null);;
						return this.head;
					}
					n.setNext(n.next.next);
					n.next.next.setPrev(n);
					return this.head;
				}
				else
					n = n.next;
			}
			return new Node("Not found");
		}
		
		public void printNodes(){
			Node n = head;
			while(n.next != null){
				System.out.print(n.data + "<->");
				n = n.next;
			}
			System.out.println(n.data);
		}
		
		public Node getHead(){
			return this.head;
		}
		
		public Node getTail(){
			return this.tail;
		}
		
		public void printHead(){
			System.out.println(this.head.getData());
		}
		
		public void printTail(){
			System.out.println(this.tail.getData());
		}
		
	}
	
}