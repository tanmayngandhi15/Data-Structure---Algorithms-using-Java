// Reverse An String

public class ReverseAnString {

    public static void main(String args[]) {

       String str = "Tanmay";
       
       for(int i = str.length()-1; i >= 0; i--) {
           
           System.out.print(str.charAt(i));
       }

    }
    
}