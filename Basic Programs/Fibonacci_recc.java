public class Fibonacci_recc {
    public static void main(String args[]) {
        
        int count = 10;
 
      printFibonacci(0, 1, count);
    }
    
    public static void printFibonacci(int s1, int s2, int count) {
    
    if(count == 0) {
        return;
    }
    
    System.out.print(s1+", ");
    
    printFibonacci(s2, s1+s2, count-1);
    
        
    }
    
}