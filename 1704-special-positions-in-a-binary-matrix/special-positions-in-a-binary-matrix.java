class Solution {
    public int numSpecial(int[][] mat) {
        int row_size = mat.length;
        int col_size = mat[0].length;
        int[] res = new int[col_size];
        int prev = -1;

        for (int row = 0; row < row_size; row++) {
            boolean flag = false;
            for (int col = 0; col < col_size; col++) {
                if (mat[row][col] == 1) {
                    if (flag) {
                        res[prev] = 0; 
                        break;
                    }
                    res[col] = mat[row][col] - res[col];
                    prev = col;
                    flag = true;
                }
            }

            
            if (flag) {
                int colCount = 0;
                for (int r = 0; r < row_size; r++) {
                    if (mat[r][prev] == 1) colCount++;
                }
                if (colCount > 1) {
                    res[prev] = 0; 
                }
            }
        }

        int no_of_spcl = 0;
        for (int ele : res) {
            no_of_spcl += ele;
        }
        return no_of_spcl;
    }
}