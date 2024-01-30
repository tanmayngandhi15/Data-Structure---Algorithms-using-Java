public class BubbleSort {
    public static void main(String args[]) {
      
      int[] arr = { 64, 34, 25, 100, 12, 22, 11, 90 };
      int i = 0;
      
      while(i<arr.length-1) {
          
          if(arr[i] > arr[i+1]) {
              
              int temp = arr[i];
              arr[i] = arr[i+1];
              arr[i+1] = temp;
              
              i = -1; 
          }
          i += 1;
      }
      
      for(int j=0;j<arr.length;j++) {
          System.out.print(arr[j]+", ");
      }
      
    }
}