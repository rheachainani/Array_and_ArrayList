# Array and ArrayList Manipulation in Java

## Part 1: EvenOddArray

### Overview
The `EvenOddArray` program separates an array of numbers into two arrays: one for even numbers and another for odd numbers. The user provides the input array using the `UserInput` class.

### Files
1. **EvenOddArray.java**: The main program for separating even and odd numbers.
2. **UserInput.java**: A utility class providing a method for user input.

### Methods

#### Main Method
- **`public static void main(String[] args)`**: 
  - Responsible for obtaining the user input for the array size.
  - Utilizes the `UserInput` class to take the array input.
  - Declares arrays for even and odd numbers and separates them accordingly.
  - Displays the even and odd arrays.

#### UserInput Class
- **`public static double[] takeInputArray(int size)`**:
  - Takes an integer `size` as input.
  - Creates a Scanner object to read input from the user.
  - Initializes a double array and populates it with user input.
  - Returns the populated array.

## Part 2: NearestNeighbor

### Overview
The `NearestNeighbor` program finds two neighboring numbers in an array with the smallest distance between them. User input is handled by the `UserInput` class.

### Files
1. **NearestNeighbor.java**: The main program for finding nearest neighbors.
2. **UserInput.java**: A utility class providing a method for user input.

### Methods

#### Main Method
- **`public static void main(String[] args)`**:
  - Obtains user input for the array size.
  - Uses the `UserInput` class to take the array input.
  - Calls the `findNearestNeighborIndex` method and displays the result.

#### findNearestNeighborIndex Method
- **`public static int findNearestNeighborIndex(double[] array)`**:
  - Takes an array of doubles as input.
  - Throws an `IllegalArgumentException` if the array has less than two elements.
  - Iterates through the array to find the neighboring numbers with the smallest distance.
  - Returns the index of the first number.

## Part 3: ArrayToArrayList

### Overview
The `ArrayToArrayList` program converts an array into an ArrayList and vice versa using the `UserInput` class for user input.

### Files
1. **ArrayToArrayList.java**: The main program for array to ArrayList conversion.
2. **UserInput.java**: A utility class providing a method for user input.

### Methods

#### Main Method
- **`public static void main(String[] args)`**:
  - Utilizes the `UserInput` class to take array input.
  - Calls the `convertArrayToArrayList` and `convertArrayListToArray` methods.
  - Displays the original array, converted ArrayList, and converted array.

#### convertArrayToArrayList Method
- **`public static ArrayList<Double> convertArrayToArrayList(double[] array)`**:
  - Takes an array of doubles as input.
  - Initializes an ArrayList and adds each element of the array using a for-each loop.
  - Returns the resulting ArrayList.

#### convertArrayListToArray Method
- **`public static Double[] convertArrayListToArray(ArrayList<Double> arrayList)`**:
  - Takes an ArrayList of Doubles as input.
  - Utilizes the `toArray` method to convert the ArrayList to an array of Doubles.
  - Returns the resulting array.
