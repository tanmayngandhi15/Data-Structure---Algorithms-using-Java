public class SelectionSort {
    public static void main(String args[]) {
      
      int[] arr = { 64, 34, 25, 100, 12, 22, 11, 90 };
      
      for(int i=0;i<arr.length;i++) {

        var minindex = i;
        
        for(int j=i;j<arr.length;j++) {

            if (arr[minindex] > arr[j]) {
                minindex = j;
            }
        }

        int temp = arr[i];
        arr[i] = arr[minindex];
        arr[minindex] = temp;
    }
      
      for(int j=0;j<arr.length;j++) {
          System.out.print(arr[j]+", ");
      }
      
    }
}