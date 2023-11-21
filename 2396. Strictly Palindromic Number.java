class Solution {
    public static boolean ispalindrome(int x){
        int y=x,n=0;
        while(y!=0){
            y/=10;
            n++;
        }
        y=x;
        for(int i=0;i<n/2;i++){
            y/=10;
            if(x/Math.pow(10,n-i-1)!=y%10){
                return false;
            }
        }
        return true;

    }
    public static int base(int x,int y){
        int i=0,j=0;
        while(x!=0){
            j+=x%y*Math.pow(10,i);
            x/=y;
            i++;
        }
        return j;
    }
    public boolean isStrictlyPalindromic(int n) {
        boolean t;
        for(int i=2;i<n-1;i++){
            t=ispalindrome(base(n,i));
            if(t==false){
                return t;
            }
        }
        return true;
    }
}
