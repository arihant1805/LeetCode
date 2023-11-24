class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int my=0;
        for(int i=piles.length-2;i>piles.length/3-1;i=i-2){
            my+=piles[i];
        }
        return my;
    }
}
