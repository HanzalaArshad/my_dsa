import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        
        // Call the insertElement function and pass in the myArray variable, index, and element to be inserted
        int[] newArray = insertElement(myArray, 2, 6);
        
        // Print out the original and new arrays to verify that the element was inserted correctly
        System.out.println("Original array: " + Arrays.toString(myArray));
        System.out.println("New array: " + Arrays.toString(newArray));
    }

    // Function to insert an element into an array at a specified index
    public static int[] insertElement(int[] arr, int index, int element) {
        // Create a new array that is one element larger than the original array
        int[] newArray = new int[arr.length + 1];

        // Copy all the elements from the original array up to the insertion point into the new array
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }

        // Insert the new element into the new array
        newArray[index] = element;

        // Copy all the elements from the original array after the insertion point into the new array
        for (int i = index + 1; i < newArray.length; i++) {
            newArray[i] = arr[i - 1];
        }

        return newArray;
    }
}
