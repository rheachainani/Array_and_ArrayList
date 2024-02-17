// Name: Rhea Chainani
// PRN: 22070126086
// Batch: AIML-B1

package Part1;
import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {
        // Input: Array size
        System.out.print("Enter the number of elements: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Use the UserInput class to get array input
        double[] inputArray = UserInput.takeInputArray(n);

        // Declare arrays
        double[] even = new double[n];
        double[] odd = new double[n];

        int evenIndex = 0;
        int oddIndex = 0;

        // Move numbers to respective arrays
        for (int i = 0; i < n; i++) {
            if (inputArray[i] % 2 == 0) {
                even[evenIndex++] = inputArray[i];
            } else {
                odd[oddIndex++] = inputArray[i];
            }
        }
        // Display arrays
        System.out.print("Even Array: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println();

        System.out.print("Odd Array: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }
        scan.close();
    }
}
