//
// Given an integer array nums, move all 0's to the start of it while maintaining the relative order of the non-zero elements.
//


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

    int nonZeroCount = nums.length-1;
        
        for(int i = nums.length-1; i >= 0; i--) {
     
            if(nums[i] != 0) {
 
               nums[nonZeroCount] = nums[i];
                nonZeroCount -= 1;
            }
        }
        
        for(int i = nonZeroCount; i >= 0; i--) {
            
            nums[i] = 0;
        }
 
  }
}
 