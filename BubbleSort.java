import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of integers in the list
        System.out.print("Enter the number of integers: ");
        int numIntegers = scanner.nextInt();

        // Create an array to store the integers
        int[] myArr = new int[numIntegers];

        // Read the integers from input
        System.out.println("Enter the integers:");
        for (int i = 0; i < numIntegers; i++) {
            myArr[i] = scanner.nextInt();
        }

        // Call the sortArray method to sort the array
        sortArray(myArr, numIntegers);

        // Output the sorted array
        System.out.println("Sorted array in descending order:");
        for (int i = 0; i < numIntegers; i++) {
            System.out.print(myArr[i] + " ");
        }

        scanner.close();
    }

    public static void sortArray(int[] myArr, int arrSize) {
        // Bubble sort algorithm to sort the array in descending order
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = 0; j < arrSize - i - 1; j++) {
                if (myArr[j] < myArr[j + 1]) {
                    // Swap the elements if they are in the wrong order
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
            }
        }
    }
}
