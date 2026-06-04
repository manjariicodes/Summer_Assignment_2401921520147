class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int srow=0, scol=0, erow=matrix.length-1, ecol=matrix[0].length-1;
        List<Integer> spiral = new ArrayList<>();
        while(srow<=erow && scol<=ecol)
        {
         //top
         for(int j=srow; j<=ecol; j++)
         {
           spiral.add(matrix[srow][j]);
         }
         //right
         for(int i=srow+1; i<=erow; i++)
         {
            spiral.add(matrix[i][ecol]);
         }
         //bottom
         for(int j=ecol-1; j>= scol; j--)
         {
            if(srow==erow)
            {
                break;
            }
            spiral.add(matrix[erow][j]);
         }
         //left
         for(int i=erow-1; i>=srow+1; i--)
         {
            if(scol==ecol)
            {
                break;
            }
            spiral.add(matrix[i][scol]);
         }
        srow++; scol++; erow--; ecol--;
        }
        return spiral;
    }
}