class Solution {
    public static boolean check(String s,char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return true;
            }

        }
        return false;
    }
    public int garbageCollection(String[] garbage, int[] travel) {
        int t=0,i1=0,i2=0,i3=0;
        for(int i=0;i<garbage.length;i++){
            t+=garbage[i].length();
        }
        for(int i=0;i<garbage.length;i++){
            if(check(garbage[i],'G')){
                i3=i;
            }
            if(check(garbage[i],'P')){
                i2=i;
            }
            if(check(garbage[i],'M')){
                i1=i;
            }
        }
        for(int i=0;i<i1;i++){
            t+=travel[i];
        }
        for(int i=0;i<i2;i++){
            t+=travel[i];
        }
        for(int i=0;i<i3;i++){
            t+=travel[i];
        }
        return t;

    }
}
