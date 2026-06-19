class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int[] array = flatten(matrix);
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(array[mid] == target)
                return true;
            else if(array[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;    

        }
        return false;
    }
    public int[] flatten(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] result = new int[rows * cols];

    int index = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[index++] = matrix[i][j];
        }
    }

    return result;
}
}
