package chapter1;

import java.util.Scanner;

public class UniqueCharsNoDS {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			for (int j = i+1; j < s.length(); j++) {
				Character n = s.charAt(j);
				if(c == n){
					flag = true;
					System.out.println("Duplicate present");
					break;
				}
			}
		}
		if(!flag)
			System.out.print("Unique");
	}
}
