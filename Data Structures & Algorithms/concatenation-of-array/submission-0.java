class Solution {
    public int[] getConcatenation(int[] nums) {
        int n2 = 2*nums.length;
        int[] result = new int[n2];
        for (int i=0;i< n2;i++){
            result[i] = nums[i%nums.length];
        }
        return result;
    }
}