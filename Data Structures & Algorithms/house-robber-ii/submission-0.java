class Solution {
    int[] memo;
    public int rob(int[] nums) {
    if (nums.length == 1) return nums[0]; // edge case
    memo = new int[nums.length];
    
    int[] nums1 = Arrays.copyOfRange(nums, 0, nums.length - 1);
    int[] nums2 = Arrays.copyOfRange(nums, 1, nums.length);
    
    Arrays.fill(memo, -1);
    int one = dfs(nums1, 0);
    
    Arrays.fill(memo, -1);
    int two = dfs(nums2, 0);
    
    return Math.max(one, two);
}
    public int dfs(int[] nums,int i){
        if(i>=nums.length)
            return 0;
        if(memo[i] != -1)
            return memo[i];    

        memo[i] = Math.max(nums[i]+dfs(nums,i+2),dfs(nums,i+1)); 
        return memo[i]; 
    }
}
