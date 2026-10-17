class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left =0;
        int right=height.length-1;
        int area=0;
        while(left<right){
            int width=right-left;
            area=Math.min(height[left],height[right])*width;
            max=Math.max(area,max);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}