// Sum Of Array

// Given an integer array Arr[] of size N. The task is to find sum of it.

// Example 1:
// Input:
// N = 4
// Arr[] = {1, 2, 3, 4}
// Output: 10
// Explanation: 1 + 2 + 3 + 4 = 10.

// Example 2:
// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 7
// Explanation: 1 + 3 + 3 = 7.

class SumOfArray {
    
    int sum(int arr[], int n) 
    {
        int sum = 0;
        
        for(int i = 0; i < n; i++) 
        { 
            sum += arr[i];
        }

        return sum;
    }
}