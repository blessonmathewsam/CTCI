package chapter1;
import java.util.HashSet;
import java.util.Scanner;

public class UniqueChars { 
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		boolean flag = false;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if(set.contains(c)){
				System.out.println("Duplicate present");
				flag = true;
				break;
			}
			else
				set.add(c);
		}
		if(!flag)
			System.out.println("All unique");
	}
}