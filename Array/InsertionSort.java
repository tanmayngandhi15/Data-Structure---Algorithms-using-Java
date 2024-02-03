public class InsertionSort {
    public static void main(String args[]) {
     
        int[] arr = { 64, 34, 25, 100, 12, 22, 11, 90 };
    
        for(int i=0;i<arr.length;i++) {
        
            int temp = arr[i];
            int j = i-1;
        
            while (j >= 0 && arr[j] > temp) {
            
                arr[j + 1] = arr[j];
                j -= 1;
            }
        
            arr[j+1] = temp;
        
        }
     
     
        for(int i=0;i<arr.length;i++) {

            System.out.print(arr[i]+", ");    
        }
     
    }
}