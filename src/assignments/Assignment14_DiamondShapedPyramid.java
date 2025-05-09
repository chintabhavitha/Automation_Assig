package assignments;

import java.util.Arrays;

public class Assignment14_DiamondShapedPyramid {

	public static void main(String[] args) {

		int n= 5;
		// upper pyramid
		// to iterate numbers from 1 to 5
		for(int i =1; i <=n; i++) {
			// to print spaces
			for(int j =n; j>i; j--) {
				System.out.print(" ");
			}
			//to print numbers
			for(int k = 1; k<=i; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		//lower pyramid
		//to iterate numbers from 4 to 1
		for(int i = n-1; i >=1; i--) {
			for (int j = n; j>i; j--) {
				System.out.print(" ");
			
			}
			for(int k =1; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
