class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int max = 0;
        
        for(int num : piles){
            if(num > max)
                max = num;
        }
        int end = max;
        int last=max;
        while(start<=end){
            int mid = start + (end-start)/2;
            int result = calculate(piles,mid);
            if(result > h)
                start = mid + 1;
            else {
                last = mid;
                end = mid - 1;
            }
                     
        }
        return last;

    }
    public int calculate(int[] piles,int k){
        int counter = 0;
        for(int num : piles){
            counter+= (num / k);
            if(num % k > 0)
                counter+=1;
        }
        return counter;
    }
}
