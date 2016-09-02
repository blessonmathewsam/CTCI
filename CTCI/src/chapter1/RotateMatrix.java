package chapter1;

import java.util.Scanner;

public class RotateMatrix {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer n = scanner.nextInt();
		Integer[][] matrix = new Integer[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[j][(n-1)-i] = scanner.nextInt();
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
