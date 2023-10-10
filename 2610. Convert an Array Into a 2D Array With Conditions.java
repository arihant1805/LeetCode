class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int z=0;
        List<List<Integer>> L = new ArrayList<>();
        while(z!=nums.length){
            int arr[]=new int[nums.length];
            List<Integer> l1=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
            if(nums[i]!=0&&arr[nums[i]-1]==0){
                z++;
                l1.add(nums[i]);
                arr[nums[i]-1]=1;
                nums[i]=0;

            }
        }
        L.add(l1);
        }
        return L;
    }
}
