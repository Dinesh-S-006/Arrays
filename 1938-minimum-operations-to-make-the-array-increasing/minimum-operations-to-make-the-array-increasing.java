class Solution {
    public int minOperations(int[] nums) {
        int operation=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int difference=(nums[i-1]+1-nums[i]);
       
                   nums[i]+=difference;
                   operation+=difference;
                }
              

            }

        
        return operation;
        
    }
}