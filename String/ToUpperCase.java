public class ToUpperCase {
    
    public static void main(String args[]) {
      
      String str = "yash";
      String output = "";
      
      for(int i = 0; i < str.length(); i++) {
          
          int asii = str.charAt(i);
          
          int cap = asii - 32;
          
          output += (char) cap;
          
      }
      
      System.out.println(output);
 
    }
    
}