class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        int val=target;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[k]+nums[j];
                    if(min==0){
                        return target;
                    }
                    if(min>Math.abs(target-sum)){
                        min=Math.abs(target-sum);
                        val=sum;    
                }
                }
            }
        }
        return val;
    }
}
