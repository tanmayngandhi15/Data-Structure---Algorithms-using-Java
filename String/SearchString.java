public class SearchString {

    public static void main(String args[]) {
      
      String str = "tanmay";
      
      String[] arr = {"yash", "ram", "mohan", "tanmay", "rahul"};
      
      boolean flag = presentString(str,arr);
      
      if(flag == true) {
          
          System.out.println(str+" is Present");
      }else {
          
          System.out.println(str+" is Not Present");
      }
      
    }
    
     public static boolean presentString(String str,String[] arr)
    {
    
        for(int i=0; i<arr.length; i++) {
        
            if(arr[i].equals(str)) {
            
                return true;
            }
        
        }

       return false;
    }
    
}