import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        // Create an array of the given size
        int[] arr = new int[n];

        // Read the elements of the array
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Read the index of the element to be retrieved
        System.out.print("Enter the index of the element to be retrieved: ");
        int index = sc.nextInt();

        try {
            // Try to retrieve the element at the given index
            int element = arr[index];
            System.out.println("The element at index " + index + " is " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // If the index is out of bounds, print an error message
            System.out.println("Invalid index! The array has only " + n + " elements.");
        }
    }
}
