// Name: Rhea Chainani
// PRN: 22070126086
// Batch: AIML-B1

package Part2;
import java.util.Scanner;
import Part1.UserInput;

public class NearestNeighbor {
    public static void main(String[] args) {
    	// Input: Array size
        System.out.print("Enter the number of elements: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // Use the UserInput class to get array input
        double[] array = UserInput.takeInputArray(n);
        int nearestIndex = findNearestNeighborIndex(array);

        // Display the result
        System.out.println("The index of the first number with the smallest distance between neighbors: " + nearestIndex);
        scan.close();
    }
    public static int findNearestNeighborIndex(double[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }
        double minDistance = Double.MAX_VALUE;
        int nearestIndex = 0;

        // Iterate through the array to find the nearest neighbors
        for (int i = 0; i < array.length - 1; i++) {
            double distance = Math.abs(array[i] - array[i + 1]);

            // Update the nearest index if a smaller distance is found
            if (distance < minDistance) {
                minDistance = distance;
                nearestIndex = i;
            }
        }
        return nearestIndex;
    }
}
