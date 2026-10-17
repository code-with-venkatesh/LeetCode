class Solution {
    public String minWindow(String s, String t) {
        if(s.length()==0 || t.length()==0 || t.length()> s.length()){
            return "";
        }
        HashMap<Character, Integer> tMap = new HashMap<>();
        for(int i=0;i<t.length();i++){
            Character c= t.charAt(i);
            tMap.put(c,tMap.getOrDefault(c,0)+1);
        }
        int required = tMap.size();
        int needed=0;
        int ans[]={-1,0,0};
        int left =0,right=0;

        HashMap<Character,Integer> sMap = new HashMap<>();


        while(right<s.length()){
            char c = s.charAt(right);
            sMap.put(c,sMap.getOrDefault(c,0)+1);

            if(tMap.containsKey(c) && sMap.get(c).intValue()==tMap.get(c).intValue()){
                needed++;
                
            }
            while(left<=right && needed == required){


                if(ans[0] == -1 || ans[0] > right - left + 1){
                    ans[0] = right - left + 1;
                    ans[1] = left;
                    ans[2] = right;
                }

                char ch = s.charAt(left);
                sMap.put(ch, sMap.get(ch) - 1);

                if(tMap.containsKey(ch) && sMap.get(ch) < tMap.get(ch)){
                    needed--;
                }
                left++;
            } 
            right++;
        }
        
        if(ans[0]==-1){
            return "";
        }
        else{
            return s.substring(ans[1],ans[2]+1);
        }

    }
}