class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int x=nums1[i];
            map.put(x,1);
        }
        int m=nums2.length;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<m;i++){
            int x=nums2[i];
            if(map.containsKey(x) && map.get(x)==1){
                result.add(x);
                map.put(x,0);
            }
            

        }
        int[] ans = new int[result.size()];
            for(int i=0;i<result.size();i++){
                ans[i]=result.get(i);
            }
        return ans;
        
    }
}
