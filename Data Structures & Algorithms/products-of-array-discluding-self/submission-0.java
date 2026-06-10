class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroindex = -1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                nums[i]++;
                zeroindex = i;
                count++;
            }
        }
        
        System.out.print(zeroindex);
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i] * prefix[i-1];
           
        }
        
        int[] output = new int[nums.length];
        int num = prefix[prefix.length-1];
        
        for(int i=0;i<nums.length;i++){
            if(count>1){
            output[i] = 0; 
            }
            else if(zeroindex == -1||i==zeroindex )
                output[i] = num / nums[i];
            else
                output[i] = 0;    
                

        }
        return output;

    }
}