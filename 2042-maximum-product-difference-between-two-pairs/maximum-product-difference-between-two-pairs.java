class Solution {
    public int maxProductDifference(int[] nums) {
        if(nums.length<4){return 0;}
         Arrays.sort(nums);
         int min1=nums[0];
         int min2=nums[1];
         int max1=nums[nums.length-1];
         int max2=nums[nums.length-2];
         int p=(max1*max2)-(min1*min2);
        return p;
    }
}