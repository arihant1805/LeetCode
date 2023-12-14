class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int[] or=new int[grid.length];
        int[] zr=new int[grid.length];
        int[] oc=new int[grid[0].length];
        int[] zc=new int[grid[0].length];
        for(int i=0;i<grid.length;i++){
            int so=0;
            int sz=0;
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    so++;
                }else{
                    sz++;
                }
            }
            or[i]=so;
            zr[i]=sz;
        }
        for(int i=0;i<grid[0].length;i++){
            int so=0;
            int sz=0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    so++;
                }else{
                    sz++;
                }
            }
            oc[i]=so;
            zc[i]=sz;
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                grid[i][j]=or[i]+oc[j]-zr[i]-zc[j];
            }
        }
        return grid;
    }
}
