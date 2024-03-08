/* 
    Sort an array of 0s, 1s and 2s

    Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.

    Input: 
    N = 5
    arr[]= {​​​​​​0 2 1 2 0}​​​​​​
    Output:
    0 0 1 2 2
    Explanation:
    0s 1s and 2s are segregated 
    into ascending order.
*/

public class SelectionSort {

    public static void main(String args[]) {
      
        int[] arr = {0​, 2, 1, 2, 0};

        int N = 5;
    
        int start = 0;
    
        for (int i=0; i < N; i++) {
            
            start = i;
            
            for (int j = i+1; j < N; j++) {
                
                if (arr[start] > arr[j]) {
                    
                    start = j;
                }
                
            }
            
            int temp = arr[i];
            arr[i] = arr[start];
            arr[start] = temp;
            
        }
      
    }
    
}