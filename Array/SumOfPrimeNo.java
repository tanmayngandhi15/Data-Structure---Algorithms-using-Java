// Take int Array & Prime the Sum of Prime No.
//  If it dosen't contain Prime No. print 0.
// Input: {1, 14, 5, 7}  Output: 12
// Input: {2, 10, 13, 9}  Output: 15

import java.util.Arrays;

public class SumOfPrimeNo {
    public static void main(String args[]) {
      
      int[] arr1 = {1,14,5,7};
      
      System.out.println("Sum of Prime No.: "+sumPrime(arr1));
      
    }
    
     public static int sumPrime(int arr[])
    {
        int sum = 0;
        boolean flag;

       for(int no: arr) {
           flag = true;
           
           if (no>1) {
               
           for(int i=2; i<no/2; i++) {
               
            if (no % i == 0) {
                flag = false;
                break;
            }
               
           }
           } else {
              flag = false; 
           }
           
           if(flag == true) {
               sum += no;
           }
       }

        return sum;
    }
    
}