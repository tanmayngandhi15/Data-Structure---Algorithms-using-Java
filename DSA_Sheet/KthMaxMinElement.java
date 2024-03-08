// Find the “Kth” max and min element of an array

public class KthMaxMinElement {

    public static void main(String args[]) {

       int[] arr = {7, 10, 4, 3, 20, 15};
       
       int N = 3;
       
        int[] a = MinMax(arr, N);

        System.out.println("Min: "+a[0]);
        System.out.println("Max: "+a[1]);

    }
    
    
    public static int[] MinMax(int[] arr, int N) {

        for (int i=0; i < arr.length; i++) {
            
            int start = i;
            
            for (int j = start+1; j < arr.length; j++) {
                
                if (arr[start] > arr[j]) {
                    
                    start = j;
                }

            }
            
            int temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
        }
        
        int min = arr[N-1];
        int max = arr[arr.length - N];
        
        return new int[] {min, max};
    } 
    
    
}