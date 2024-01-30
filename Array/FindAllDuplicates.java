public class FindAllDuplicates {
    public static void main(String args[]) {
      
      int[] arr = {1,2,5,4,6,5,7,8,1};
      int i = 0;
      
      while(i<arr.length) {
          
          for(int j=i; j<arr.length;j++) {
              
              if(i!=j && arr[i]==arr[j]) {
                  System.out.println(arr[j]);
              }
              
          }
          
          i += 1;
      }
      
    }
}