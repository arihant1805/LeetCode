class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        HashSet<List<Integer>> s= new HashSet<>();
        HashMap<Integer,Integer> n=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            n.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=-nums[i]-nums[j];
                if(n.containsKey(k)&&(i!=n.get(k)&&j!=n.get(k))){
                    List<Integer> l1=new ArrayList<>();
                        l1.add(nums[i]);
                        l1.add(nums[j]);
                        l1.add(-nums[i]-nums[j]);
                        Collections.sort(l1);
                        s.add(l1);
                }
            }
        }                
        for(List<Integer> l1:s){
            l.add(l1);
        }
        return l;
    }
}
