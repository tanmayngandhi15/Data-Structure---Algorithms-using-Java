// Palindrome String

// Given a string S, check if it is palindrome or not.

// Example 1:
// Input: S = "abba"
// Output: 1
// Explanation: S is a palindrome

// Example 2:
// Input: S = "abc" 
// Output: 0
// Explanation: S is not a palindrome

class Solution {

    int isPalindrome(String S) {

        int i=0;
        int j = S.length()-1;

        while(i < j) {

            if(S.charAt(i) != S.charAt(j)) {

                return 0;
            }

            i++;
            j--;

        }
        
       return 1;
    }
}