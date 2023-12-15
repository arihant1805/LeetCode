class Solution {
    public int[] processQueries(int[] queries, int m) {
        int P[] = new int[m];
        for(int i=1;i<m+1;i++){
            P[i-1]=i;
        }
        for(int i=0;i<queries.length;i++){
            int id=0;
            for(int j=0;j<m;j++){
                if(P[j]==queries[i]){
                    id=j;
                    break;
                }
            }
            for(int j=id;j>0;j--){
                P[j]=P[j-1];
            }
            P[0]=queries[i];
            queries[i]=id;
            
        }
        return queries;
    }
}
