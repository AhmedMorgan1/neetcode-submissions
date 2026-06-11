class Solution {
    public int longestConsecutive(int[] nums) {
        Set set = new HashSet<Integer>();
        if(nums.length == 0) return 0;
        for(int num : nums)
            set.add(num);
        int count=1;
        int max = 1;
        for(int num : nums){
            int next = num+1;
            while(set.contains(next)){
                count++;
                next++;
            }
            if(count>max)
                max = count;  
            count=1; 
        }
        return max;
    }
}

