class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int col = matrix[0].length;
        int row = matrix.length;
        int length = col * row;
        int end = length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[mid/col][mid%col] == target)
                return true;
            else if(matrix[mid/col][mid%col] > target)
                end = mid - 1;
            else
                start = mid + 1;    

        }
        return false;
    }
    
}
