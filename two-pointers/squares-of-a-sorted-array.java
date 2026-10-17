class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0,r=nums.length-1,index=nums.length-1;
        int [] result = new int[nums.length];
        while(l<=r){
            if(Math.abs(nums[l])>Math.abs(nums[r])){
                result[index]=nums[l]*nums[l];
                l++;
            }
            else {
                result[index]=nums[r]*nums[r];
                r--;
            }
            index--;
        }
        return result;
    }
}