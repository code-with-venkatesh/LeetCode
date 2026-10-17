class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        if(strs.length==0){
            return new ArrayList<>();
        }
        int []count = new int[26];
        for(String s:strs){
            Arrays.fill(count,0);

            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i:count){
                sb.append("#");
                sb.append(i);
            }
            String key = sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);

        }
        return new ArrayList<>(map.values());
        
    }
}