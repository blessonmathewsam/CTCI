package chapter1;

import java.util.Scanner;

public class StringCompress {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String out = "";
		
		char c = '\0';
		
		Integer count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(i == 0){
				c = s.charAt(i);
				count++;
			}
			else if(c != s.charAt(i)){
				out = out + c + count;
				c = s.charAt(i);
				count = 1;;
			}
			else if(c == s.charAt(i))
				count++;
			
			if((i + 1) == s.length()){
				out = out + c + count;
			}
		}
		
		System.out.println(out);
	}

}
