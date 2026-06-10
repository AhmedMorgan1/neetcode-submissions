class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length +1];
        prefix[0] = 0;
        for(int i=1;i<prefix.length;i++){
            prefix[i] = nums[i-1] + prefix[i-1];
        }

        if(prefix[prefix.length-1] == prefix[1])
            return 0;
     
        for(int i=1;i<nums.length;i++){
            int leftsum = prefix[i];
            int rightsum = prefix[nums.length] - prefix[i+1];
            System.out.println(leftsum + " , " + rightsum);
            if(leftsum == rightsum)
                return i;
        }
        if(prefix[prefix.length-1] == 0)
            return nums.length-1;
        return -1;
    }
}