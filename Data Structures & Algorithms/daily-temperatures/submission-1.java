class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int [] result = new int[temperatures.length];
        int i;
        int j;
        for( i=0;i<temperatures.length;i++){
            for( j = i+1 ; j<temperatures.length;j++){
                if(temperatures[j] > temperatures[i]){
                    result[i] = j-i;
                    break;
            }
            }
            
        }
        return result;
    }
}
