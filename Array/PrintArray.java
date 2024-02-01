
// Print Elements of the given Array.

// Given an array Arr of size N, print all its elements.

// Example 1:
// Input:
// N = 5
// Arr[] = {1, 2, 3, 4, 5}
// Output: 1 2 3 4 5

// Example 2:
// Input:
// N = 4
// Arr[] = {2, 3, 5, 5}
// Output: 2 3 5 5

public class PrintArray {

    public static void main(String[] args) {    

        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("Element of Array are: ");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i]+" ");
        }

    }

}