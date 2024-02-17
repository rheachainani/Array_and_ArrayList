// Name: Rhea Chainani
// PRN: 22070126086
// Batch: AIML-B1

package Part3;

import java.util.*;
import Part1.UserInput;

public class ArrayToArrayList {
    public static void main(String[] args) {
        // Use the UserInput class from Part1 to take array input
        double[] inputArray = UserInput.takeInputArray(5);

        // Convert array to ArrayList
        ArrayList<Double> arrayList = convertArrayToArrayList(inputArray);

        // Convert ArrayList to array
        Double[] newArray = convertArrayListToArray(arrayList);

        // Display the converted array and ArrayList
        System.out.println("Original Array: " + Arrays.toString(inputArray));
        System.out.println("Converted ArrayList: " + arrayList);
        System.out.println("Converted Array: " + Arrays.toString(newArray));
    }
    
    public static ArrayList<Double> convertArrayToArrayList(double[] array) {
        ArrayList<Double> arrayList = new ArrayList<>();
        // adding each element of array to array list using for loop
        for (double value : array) {
            arrayList.add(value);
        }
        return arrayList;
    }

    public static Double[] convertArrayListToArray(ArrayList<Double> arrayList) {
        return arrayList.toArray(new Double[arrayList.size()]); 
    }
}
