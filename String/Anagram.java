// Anagram

// Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

// Note:-
// If the strings are anagrams you have to return True or else return False
// |s| represents the length of string s.

// Example 1:
// Input:a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have same characters with
// same frequency. So, both are anagrams.

// Example 2:
// Input:a = allergy, b = allergic
// Output: NO
// Explanation: Characters in both the strings are 
// not same, so they are not anagrams.


class Solution
{​​​​​   

    public static boolean isAnagram(String a,String b)
    {​​​​​

        if (a.length() == b.length()) {​​​​​

            String strAll = a+b;

            HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

            for(int i=0;i<strAll.length();i++) {​​​​​

            char c = strAll.charAt(i);

            if(hm.containsKey(c)) {​​​​​

                hm.put(c,hm.get(c)+1);

            }​​​​​ else {​​​​​

                hm.put(c,1);

            }​​​​​

        }​​​​​

        for(char k: hm.keySet()) {​​​​​

            String key = String.valueOf(k);

            if (!a.contains(key)) {​​​​​

                return false;

            }​​​​​

            if(!b.contains(key)) {​​​​​

                return false;

            }​​​​​

            int v = hm.get(k);

            if (v%2!=0) {​​​​​

                return false;

            }​​​​​

        }​​​​​

            return true;

        }​​​​​

       return false;

    }​​​​​

}​​​​​