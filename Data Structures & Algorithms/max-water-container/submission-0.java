class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int right = heights.length-1;
        int left = 0;
        while(left<right){
        int hight = Math.min(heights[right],heights[left]);
        int area = hight * (right-left);
        if(heights[right]>=heights[left] )
            left++; 
        else
            right--;

        max = Math.max(max,area);    

    }
    return max;
}
}
