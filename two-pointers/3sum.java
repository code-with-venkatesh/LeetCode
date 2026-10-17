class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        for (int i = 0; i < n - 2 && nums[i] <= 0; i++) {
            if (i > 0 && nums[i] == nums[i-1]) continue;
            
            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int complement = target - nums[j];
                if (seen.contains(complement)) {
                    result.add(Arrays.asList(nums[i], complement, nums[j]));
                    // skip duplicate nums[j] (same value)
                    while (j + 1 < n && nums[j+1] == nums[j]) j++;
                }
                seen.add(nums[j]);
            }
        }
        return result;
    }
}