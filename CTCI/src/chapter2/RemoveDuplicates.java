package chapter2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter count: ");
		int count = scanner.nextInt();
		int i = 0;
		while(i < count){
			list.add(scanner.nextInt());
			i++;
		}
		scanner.close();
		
		HashSet<Integer> set = new HashSet<>();
		list.forEach(n -> {if(!set.contains(n)) set.add(n);});
		
		list.clear(); 
		list.addAll(set);
		list.forEach(n -> System.out.print(n+" "));
	}

}
