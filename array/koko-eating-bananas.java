class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int l=1,r=1;
        for(int i=0;i<n;i++){
            r=Math.max(piles[i],r);
        }
        while(l<r){
            int mid=l+(r-l)/2;
            if(canFinish(piles,mid,h)){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
    public boolean canFinish(int[] piles, int speed, int h){
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours += (piles[i] + speed - 1) / speed;
        }
        return hours<=h;
    }
}