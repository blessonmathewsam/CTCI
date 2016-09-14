package chapter2;

public class SinglyLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(1);
		list.addNode(2);
		list.addNode(3);
		list.printNodes();
		list.deleteNode(1); 
		list.printNodes();
		System.out.println(list.getHead().getData());
		list.printTail();
		System.out.println(list.findNode(1).getData());
	}

	public static class Node {
		
		private int data;
		private Node next;
		
		public Node(){
			this.data = -1;
			this.next = null;
		}
		
		public Node(int n){
			this.data = n;
			this.next = null;
		}
		
		public int getData() {
			return data;
		}
		public void setData(int n) {
			this.data = n;
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
		private int size;
		
		public LinkedList(){
			this.head = null;
			this.tail = null;
			this.size = 0;
		}
		
		public LinkedList(Node head){
			this.head = head;
			this.tail = head;
			this.size = 1;
		}
		
		public LinkedList(Node head, Node tail) {
			this.head = head;
			this.tail = tail;
			this.head.setNext(tail);
			this.size = 2;
		}

		public Node addNode(int n){
			if(this.head == null){
				this.head = new Node(n);
				this.tail = this.head;
				this.size = 1;
				return this.head;
			}
			Node node = new Node(n);
			this.tail.setNext(node);;
			this.tail = node;
			this.size += 1;
			return null;
		}
		
		public Node addNode(int[] array){
			if(array.length > 0){
				Boolean flag = false;
				if(this.head == null){
					this.head = new Node(array[0]);
					this.tail = this.head;
					flag = true;
				}
				int i = 0;
				if(flag) i = 1;
				for(;i < array.length; i++){
					Node node = new Node(array[i]);
					this.tail.setNext(node);;
					this.tail = node;
				}
				this.size += array.length;
				return this.head;
			}
			return null;
		}
		
		
		public Node addNode(Node n){
			return this.addNode(n.getData());
		}
		
		public Node findNode(int num){
			Node n = this.head;
			if(n.getData() == num)
				return n;
			while(n.next != null){
				if(n.next.getData() == num)
					return n.next;
				else
					n = n.next;
			}
			return new Node(-1);
		}
		
		public Node findNode(Node n){
			return this.findNode(n.getData());
		}
		
		public Node deleteNode(int num){
			Node n = this.head;
			if(n.getData() == num){
				this.head = n.next;
				return this.head;
			}
			while(n.next != null){
				if(n.next.getData() == num){
					if(n.next.next == null){
						this.tail = n;
						n.setNext(null);;
						return this.head;
					}
					n.setNext(n.next.next);
					return this.head;
				}
				else
					n = n.next;
			}
			return new Node(-1);
		}
		
		public void printNodes(){
			Node n = head;
			while(n.next != null){
				System.out.print(n.getData() + "<->");
				n = n.next; 
			}
			System.out.println(n.getData());
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
		
		public int size(){
			return this.size;
		}
		
	}
	
}