class Solution {
    
    public int maxWidthOfVerticalArea(int[][] points) {
        int max=0;
        int point[]=new int[points.length];
        for(int i=0;i<point.length;i++){
            point[i]=points[i][0];
        }
        Arrays.sort(point);
        for(int i=1;i<points.length;i++){
            int diff=point[i]-point[i-1];
            if(max<diff){
                max=diff;
            }
        }
        return max;

    }
}
