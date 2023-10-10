class Solution {
    public static int POW(int x){
        int n=1;
        for(int i=0;i<x;i++){
            n*=10;
        }
        return n;
    }
    public List<Integer> addToArrayForm(int[] num, int k) {
        int c=0,i=1;
        while(i<=num.length){
            num[num.length-i]=num[num.length-i]+k%10+c;
            c=0;
            if(num[num.length-i]>9){
                c=num[num.length-i]/10;
                num[num.length-i]%=10; 
                }
            i++;
            k/=10;
        }
        
        List <Integer> l1 = new ArrayList<>();
        k+=c;
        if(k>0){
            int n=k,y=k;
            int r=0;
            while(n!=0){
                r++;
                n/=10;
            }
            while(y!=0){
                n=k;
                l1.add((n/POW(r-1))%10);
                y/=10;
                r--;
            }
            
        }
        
        for(int j=0;j<num.length;j++){
            l1.add(num[j]);
        }
        return l1;
    }
}
