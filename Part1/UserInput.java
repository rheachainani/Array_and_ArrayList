package Part1;

import java.util.Scanner;

public class UserInput {
	public static double[] takeInputArray(int size) {
		Scanner scan = new Scanner(System.in);
		double[] array = new double[size];
		
		System.out.println("Enter array elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = scan.nextInt();
		}
		
		scan.close();
		
		return array;
	}
}
