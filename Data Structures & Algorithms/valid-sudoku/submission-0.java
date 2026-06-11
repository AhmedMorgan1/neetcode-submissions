class Solution {
    public boolean isValidSudoku(char[][] board) {
        // check cols
        for (int col = 0; col < 9; col++) {
            Set<Character> columns = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char cell = board[row][col];
                if (cell != '.') {
                    if (!columns.add(cell)) return false;
                }
            }
        }
        // check rows
        for (int row = 0; row < 9; row++) {
            Set<Character> rows = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char cell = board[row][col];
                if (cell != '.') {
                    if (!rows.add(cell)) return false;
                }
            }
        }
        // check boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                Set<Character> box = new HashSet<>();
                for (int row = boxRow * 3; row < boxRow * 3 + 3; row++) {
                    for (int col = boxCol * 3; col < boxCol * 3 + 3; col++) {
                        char cell = board[row][col];
                        if (cell != '.') {
                            if (!box.add(cell)) return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}