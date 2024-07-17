//
// 283. Move Zeroes
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
// Move Zeroes - LeetCode


class Solution {
    
    public static void main(String[] args) {
    
    int[] arr = {0,1,2,0,3,4};

    Solution sol = new Solution();
    sol.moveZeroes(arr);

    for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    public void moveZeroes(int[] nums) {

    int nonZeroCount = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] != 0) {
 
               nums[nonZeroCount] = nums[i];
                nonZeroCount += 1;
            }
        }
        
        for(int i = nonZeroCount; i < nums.length; i++) {
            
            nums[i] = 0;
        }
 
  }
}
 
 