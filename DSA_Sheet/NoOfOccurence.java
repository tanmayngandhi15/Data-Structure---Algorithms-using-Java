// Count the Number Of Occurence's of character in a String.

import java.util.HashMap;

public class NoOfOccurence {
    public static void main(String args[]) {
      
      String str = "tanmay";
      
      HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
      
      for  (char e : str.toCharArray()) {
          
          if (hm.containsKey(e)) {
              
              hm.put(e, hm.get(e) + 1);
          } else {
              
              hm.put(e, 1);
          }
          
      }
      
      System.out.println(hm);
      
    }
}