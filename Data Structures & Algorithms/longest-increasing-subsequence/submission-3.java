class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> tails = new ArrayList<>();
        for(int num : nums){
            if(tails.isEmpty() || num >tails.get(tails.size()-1)){
                tails.add(num);
            }
            else{
                int start=0;
                int end = tails.size()-1;
                while(start<end){
                    int mid = start + (end - start) / 2;
                    if(tails.get(mid)<num)
                        start = mid+1;
                    else
                        end = mid;
                        

                }
                tails.set(start,num);
            }
        }
        return tails.size();
    }
}
