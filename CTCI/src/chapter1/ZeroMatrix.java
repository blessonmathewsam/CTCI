package chapter1;

import java.util.Scanner;

public class ZeroMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		Integer[][] matrix = new Integer[n][n];
		int row = 0,col = 0;
		Boolean flag = false;
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[i][j] = scanner.nextInt();
				if(matrix[i][j] == 0){
					row = i; col = j;
					flag = true;
				}
					
			}
		}
		
		if(flag){
			for(int i = 0; i < n; i++){
				matrix[i][col] = 0;
			}
			
			for(int j = 0; j < n; j++){
				matrix[row][j] = 0;
			}
		}
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
