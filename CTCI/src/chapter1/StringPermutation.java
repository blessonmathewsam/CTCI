package chapter1;

import java.util.HashMap;
import java.util.Scanner;

public class StringPermutation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next().toLowerCase();
		String s2 = scanner.next().toLowerCase();
		if(!(s1.length() == s2.length()))
			System.out.println("Not a permutation");
		else{
			HashMap<Character, Integer> first = new HashMap<>();
			HashMap<Character, Integer> second = new HashMap<>();
			Boolean flag = false;
			for (int i = 0; i < s1.length(); i++) {
				Character c = s1.charAt(i);
				if(first.containsKey(c))
					first.put(c, first.get(c)+1);
				else
					first.put(c, 1);
			}
			for (int i = 0; i < s2.length(); i++) {
				Character c = s2.charAt(i);
				if(second.containsKey(c))
					second.put(c, second.get(c)+1);
				else
					second.put(c, 1);
			}
			for(Character c: first.keySet()){
				if(!second.containsKey(c)){
					System.out.println("Not a permutation");
					flag = true;
					break;
				}
				else{
					if(first.get(c)!=second.get(c)){
						System.out.println("Not a permutation");
						flag = true;
						break;
					}
				}
			}
			if(!flag)
				System.out.println("Permutation");
		}
	}

}
