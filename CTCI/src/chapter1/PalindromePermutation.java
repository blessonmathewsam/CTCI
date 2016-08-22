package chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class PalindromePermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		s = s.replaceAll("\\s+", "");
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else{
				map.put(s.charAt(i), 1);
			}
		}
		Boolean flag = false;
		Boolean flag2 = false;
		for (Character c: map.keySet()) {
			if(map.get(c)%2 != 0){
				if(flag){
					System.out.println("Not palindrome");
					flag2 = true;
					break;
				}
				else
					flag = true;
			}
		}
		if(!flag2)
			System.out.println("Palindrome");
	}

}
