// Majority Element
 
// Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears strictly more than N/2 times in the array.

// Example 1:
// Input:
// N = 3 
// A[] = {1,2,3} 
// Output:
// -1
// Explanation:
// Since, each element in 
// {1,2,3} appears only once so there 
// is no majority element.

// Example 2:
// Input:
// N = 5 
// A[] = {3,1,3,3,2} 
// Output:
// 3
// Explanation:
// Since, 3 is present more
// than N/2 times, so it is 
// the majority element.


class Solution
{​​​​​

    static int majorityElement(int a[], int size)

    {​​​​​

        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

        for(int j: a) {​​​​​

         if (hm.containsKey(j)) {​​​​​

              hm.put(j , hm.get(j)+1);

            }​​​​​else {​​​​​

                hm.put(j,1);
                
            }​​​​​

        }​​​​​


        for (int i : hm.keySet()) {​​​​​

            int j = hm.get(i);

                if(j > a.length/2) {​​​​​

                    return i;

                }​​​​​

            }​​​​​

        return -1;

    }​​​​​

}​​​​​