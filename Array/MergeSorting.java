public class MergeSorting {
    public static void main(String args[]) {
      
      int[] arr = {2,5,7,8,9,1,4,6,3};
      
      mergeSort(0, arr.length-1, arr);
      
      printArray(arr);
     
    }

    
    public static void mergeSort(int start, int end, int[] arr) {
        
        if (start >= end) {
            return;
        }
        
        int mid = (start+end) / 2;

        mergeSort(start, mid, arr);
        
        mergeSort(mid+1, end, arr);
        
        merge(start, end, arr);
        
    }
    
    
    public static void merge(int start, int end, int[] arr) {
        
        int mid = (start + end) / 2;
        
        int n1 = mid - start + 1;
        int n2 = end - mid;
        
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];
        
        for(int i=0; i < n1; ++i) {
            leftArray[i] = arr[start + i];
        }
        
        for(int i=0; i < n2; ++i) {
            rightArray[i] = arr[mid + 1 + i];
        }
        
        int j=0, k=0;
        
        for(int i=0; i<arr.length; i++) {
            
            if (j>n1 && k>n2) {
            
            break;
            
            } else if(j<n1 && k<n2) {
                
                if(leftArray[j] <= rightArray[k]) {
                    
                    arr[start] = leftArray[j];
                    j++;
                } else {
                    
                    arr[start] = rightArray[k];
                    k++;
                }
                
            } else if (j<n1) {
                
                arr[start] = leftArray[j];
                j++;
            } else if (k<n2) {
                
                arr[start] = rightArray[k];
                k++;
            }
           
           
            start++ ;
        }
        
        
    }
    

    public static void printArray(int[] arr) {
        
        for (int num : arr) {
            System.out.print(num + ", ");
        }
        System.out.println("\n");
    }
    
    
}