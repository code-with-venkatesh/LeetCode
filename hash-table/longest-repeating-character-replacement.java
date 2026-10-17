class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int left =0, maxOccurance =0, longestRepeating=0;
        int occurance[]= new int[26];
        for(int right =0;right<n;right++){
            maxOccurance = Math.max(maxOccurance, ++occurance[s.charAt(right)-'A']);
            if((right-left+1)- maxOccurance > k){
                occurance[s.charAt(left)-'A']--;
                left++;
            }
            longestRepeating =Math.max(longestRepeating , right-left+1);
        }
        return longestRepeating;
    }
}