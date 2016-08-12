package chapter1;

import java.util.Scanner;

public class SpaceReplace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		Integer l = scanner.nextInt();
		char[] arr = new char[s.length()];
		for (int i = 0, j = 0; i < l; i++) {
			char c = s.charAt(i);
			if(j < s.length()){
				if(Character.isWhitespace(c)){
					arr[j] = '%';
					arr[j+1] = '2';
					arr[j+2] = '0';
					j = j+3;
				}
				else{
					arr[j] = c;
					j++;
				}
			}
		}
		System.out.println(arr);
	}
}
