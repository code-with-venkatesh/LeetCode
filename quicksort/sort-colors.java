class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1,current=0;
        while(current<=high){
            if(nums[current]==0){
                swap(nums,current,low);
                low++;
                current++;
            }
            else if(nums[current]==2){
                swap(nums,current,high);
                high--;

            }
            else{
                current++;
            }
        }
        
    }
    public static void swap(int[] nums,int s, int e){

        int temp=nums[s];
        nums[s]=nums[e];
        nums[e]=temp;
    }
}