/**
 * 
 */
package chapter3;

/**
 * @author blessonm
 *
 */
public class Stack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack.peek().getData());
		System.out.println(stack.pop().getData());
		System.out.println(stack.pop().getData());
		System.out.println(stack.pop().getData());
		System.out.println(stack.pop().getData());
		System.out.println(stack.pop().getValid());
	}
	
	public static class Node {
		private Node next;
		private int data;
		private Boolean valid;
		
		public Node(){
			this.next = null;
			this.valid = true;
		}
		
		public Node(Boolean valid){
			this.next = null;
			this.valid = valid;
		}
		
		public Node(int data){
			this.data = data;
			this.next = null;
			this.valid = true;
		}
		
		public Node(Node node, int data){
			this.next = node;
			this.data = data;
			this.valid = true;
		}

		public Boolean getValid() {
			return valid;
		}

		public void setValid(Boolean valid) {
			this.valid = valid;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
	}
	
	private Node top;
	
	public Stack(){
		this.top = null;
	}
	
	public Stack(Node node){
		this.top = node;
	}
	
	public Node push(int data){
		if(this.top == null){
			this.top = new Node(data);
			return this.top;
		}
		Node node = new Node(data);
		node.setNext(this.top);
		this.top = node;
		return this.top;
	}
	
	public Node push(Node node){
		return this.push(node.getData());
	}
	
	public Node pop(){
		if(this.top == null){
			Node node = new Node(false);
			return node;
		}
		Node node = this.top;
		if(node.getNext() == null){
			this.top = null;
			return node;
		}
		else
			this.top = this.top.getNext();
		return node;
	}
	
	public Node peek(){
		return this.top;
	}
	
	public Boolean isEmpty(){
		return (this.top == null);
	}

}
