// Reverse An Array


import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String args[]) {

        int[] arr = {7, 10, 4, 3, 20, 15};

        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start += 1;
            end -= 1;
            
        }
        
        System.out.println(Arrays.toString(arr));
      
    }
    
}