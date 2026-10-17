class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;int maxSum=0;
        //first window sum
        for(int i=0;i<k;i++){
            sum+=nums[i];
            maxSum=sum;
            //store first window sum as maxSum
        }
         // slide window, 
        for(int i=k;i<nums.length;i++){
            sum+=nums[i]-nums[i-k];
            //update maxSum
            maxSum=Math.max(maxSum,sum);
        }
        return (double) maxSum/k;

    }
}