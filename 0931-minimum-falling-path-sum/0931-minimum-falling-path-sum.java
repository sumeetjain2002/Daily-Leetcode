class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int[][] mat = new int[n][n];

        for(int i=0; i<n; i++){
            mat[0][i] = matrix[0][i];
        }

        for(int row=1; row<n; row++){
            for(int col=0; col<n; col++){
                int min = Integer.MAX_VALUE;    
                min = Math.min(min , matrix[row][col] + mat[row-1][col]);
        if(col-1 >= 0)    min = Math.min(min , matrix[row][col] + mat[row-1][col-1]);
                if(col+1 <= n-1)    min = Math.min(min, matrix[row][col] + mat[row-1][col+1]);

                mat[row][col] = min;
            }
        }
        int answer = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            answer = Math.min(answer , mat[n-1][i]);
        }
        return answer;
    }
}