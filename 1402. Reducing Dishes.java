// My first Hard problem on leetcode
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int max=0;
        for(int i=0;i<satisfaction.length;i++){
            int y=1;
            int sum=0;
            for(int j=i;j<satisfaction.length;j++){
                sum+=satisfaction[j]*y;
                y++;
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
