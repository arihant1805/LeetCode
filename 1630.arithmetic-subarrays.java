class Solution {
    public boolean check(int a[]){
        if(a.length<2){
            return false;
        }
        Arrays.sort(a);
        int d=a[1]-a[0];
        for(int i=2;i<a.length;i++){
           if( a[i]-a[i-1]!=d){
               return false;
           }
        }
        return true;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        ArrayList<Boolean> l1=new ArrayList<>();
        for(int i=0;i<l.length;i++){
            if(check(Arrays.copyOfRange(nums,l[i],r[i]+1))){
                l1.add(true);
            }else{
                l1.add(false);
            }
        }
        return l1;
    }
}
