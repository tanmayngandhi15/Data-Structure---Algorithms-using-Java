// Merge and Sort

// Given two arrays of length N and M, print the merged array in ascending order containing only unique elements.

// Example 1:
// Input:
// N = 2
// a[] = {​​​​​​1, 8}​​​​​​
// M = 2
// b[] = {​​​​​​10, 11}​​​​​​
// Output:
// answer[] = {​​​​​​1, 8, 10, 11}​​​​​​
// Explanation:
// The answer[] array after merging both
// the arrays and removing duplicates is
// [1 8, 10, 11]
// You have to return the size of the array
// formed ( 4 in this case) and update the
// answer array in the function mergeNsort().
 
// Example 2:
// Input:
// N = 5
// a[] = {​​​​​​7, 1, 5, 3, 9}​​​​​​
// M = 6
// b[]  = {​​​​​​8, 4, 3, 5, 2, 6}​​​​​​
// Output:
// answer[] = {​​​​​​1, 2, 3, 4, 5, 6, 7, 8, 9}​​​​​​ 


class MergeAndSort {​​​​​

    public static int mergeNsort(int a[], int b[], int n, int m, int answer[]) {​​​​​

       n -= 1;

       m -= 1;

       HashSet<Integer> hs = new HashSet<Integer>();

       int count = (n > m) ? n:m;

       for(int i=0; i<= count ;i++) {​​​​​

            if(n >= 0) {​​​​​

               hs.add(a[n]);

               n -= 1;

           }​​​​​

           if(m >= 0) {​​​​​


               hs.add(b[m]);

               m -= 1;

           }​​​​​

       }​​​​​

            int j = 0;

         for(int i: hs){​​​​​

             answer[j] = i;

             j++;

        }​​​​​

        return j;

    }​​​​​

}​​​​​