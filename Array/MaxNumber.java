public class MaxNumber {
    
    public static void main(String[] args) {
        
        int[] arr = {3, 4, 6, 1, 8, 4, 5};
        int maxNo = arr[0];
        
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > maxNo) {
                maxNo = arr[i];
            }
        }
        
        System.out.println("Maximum No: "+maxNo);
        
    }
    
}