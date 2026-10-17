class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> numsMap = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            numsMap.add(nums[i]);
        }
        int Lcs=0;
        for(int num:numsMap){
            if(numsMap.contains(num-1)){
                continue;
            }
            else{
                int currNum=num;
                int currLcs=1;
                while(numsMap.contains(currNum+1)){
                    currLcs++;
                    currNum++;
                }
                Lcs =Math.max(Lcs,currLcs);
            }
        }
        return Lcs;
    }
}