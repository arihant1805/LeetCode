class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int rs=0,ls=0;
        for(int i=0;i<nums.length;i++){
            rs+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int curr=nums[i];
            rs-=curr;
            nums[i]=i*curr-ls-(nums.length-i-1)*curr+rs;
            ls+=curr;
        }
        return nums;
    }
}
