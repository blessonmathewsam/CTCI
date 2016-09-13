package chapter2;

public class RecursiveKthToLast {
	
	static int counter = 0;

	public static int findkth(LinkedList<Integer> list, int k){
		if(list.next == null)
			return 0;
		
		counter = findkth(list.next, k) + 1;
		
		if(counter == k)
			return list.data;
	}

}
