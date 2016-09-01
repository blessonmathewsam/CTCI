package chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class EditDistance {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string1 = scanner.nextLine();
		String string2 = scanner.nextLine();
		
		String s1, s2;
		
		if(string1.length() > string2.length()){
			s1 = string1;
			s2 = string2;
		}
		else{
			s1 = string2;
			s2 = string1;
		}
		
		HashMap<Character, Integer> s1Map = new HashMap<>();
		HashMap<Character, Integer> s2Map = new HashMap<>();
		
		for (int i = 0; i < s1.length(); i++) {
			if(s1Map.containsKey(s1.charAt(i)))
				s1Map.put(s1.charAt(i), s1Map.get(s1.charAt(i))+1);
			else
				s1Map.put(s1.charAt(i), 1);
		}
		
		for (int i = 0; i < s2.length(); i++) {
			if(s2Map.containsKey(s2.charAt(i)))
				s2Map.put(s2.charAt(i), s2Map.get(s2.charAt(i))+1);
			else
				s2Map.put(s2.charAt(i), 1);
		}
		
		int distance = 0;
		
		for (Character c: s1Map.keySet()){
			if(distance > 1){
				System.out.println("False");
				break;
			}
			if(s2Map.containsKey(c)){
				if(s1Map.get(c) - s2Map.get(c) != 0)
					distance = s1Map.get(c) - s2Map.get(c);
			}
			else
				distance += 1;
		}
		
		if(distance == 1)
			System.out.println("True");
		
	}

}
