class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int total=0;
        int lmax=height[0],rmax=height[n-1];
        while(l<r){
            if(height[l]<height[r]){
                lmax=Math.max(height[l],lmax);
                if((lmax-height[l])>0){
                    total+=lmax-height[l];
                }
                l++;
            }
            else if(height[r]<=height[l]){
                rmax=Math.max(rmax,height[r]);
                if(rmax-height[r]>0){
                    total+=rmax-height[r];

                }
                r--;
            }

        }
        return total;
    }
}