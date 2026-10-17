class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x=nums1.length;
        int y=nums2.length;
        if(x>y){
            return findMedianSortedArrays(nums2,nums1);
        }
        int start=0,end=x;
        while(start<=end){
            int XPart=(start+end)/2;
            int YPart=(x+y+1)/2 -XPart;
            
            int xleft=XPart==0 ? Integer.MIN_VALUE : nums1[XPart-1];
            int xright=XPart==x ? Integer.MAX_VALUE : nums1[XPart];

            int yleft=YPart==0 ? Integer.MIN_VALUE : nums2[YPart-1];
            int yright=YPart==y ? Integer.MAX_VALUE : nums2[YPart];

            if(xleft<=yright && yleft<=xright){
                if((x+y)%2==0){
                    int min=Math.max(xleft,yleft);
                    int max= Math.min(yright,xright);
                    return (double)(min+max)/2;
                }
                else return (double) Math.max(xleft,yleft);
            }
            else if(xleft>yright){
                end=XPart-1;

            }
            else{
                start=XPart+1;

            }
            

        }
        return 0;
    }
}