class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a=new int[nums.length];
        int I=1,J=0;
        for(int i:nums){
            if(i<0){
                a[I]=i;
                I=I+2;
            }else{
                a[J]=i;
                J=J+2;
            }
        }
        return a;
    }
}
