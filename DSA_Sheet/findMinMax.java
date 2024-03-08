// Find Minimum & Maximum value


public class findMinMax {

    public static void main(String args[]) {

       int[] arr = {7, 10, 4, 3, 20, 15};
       
        int[] a = MinMax(arr);

        System.out.println("Min: "+a[0]);
        System.out.println("Max: "+a[1]);

    }
    
    
    public static int[] MinMax(int[] arr) {
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i=1; i < arr.length; i++) {
            
            if (arr[i] > max) {
            
                max = arr[i];    
            } else if (arr[i] < min) {
                
                min = arr[i];
            }
            
        }
        
        return new int[] {min, max};
    } 
    
    
}