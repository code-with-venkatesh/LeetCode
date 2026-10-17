class Solution {

    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        rotateArray(nums, 0, n - 1);
        rotateArray(nums, 0, k - 1);
        rotateArray(nums, k, n - 1);
    }

    public void rotateArray(int[] nums, int a, int b) {

        while (a < b) {

            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;

            a++;
            b--;
        }
    }
}