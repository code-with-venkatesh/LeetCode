class Solution {
    public String reverseWords(String s) {
        int n=s.length();

        int i=n-1;
        StringBuilder result= new StringBuilder();
        while(i>=0){
            if( s.charAt(i)==' '){
                i--;
                continue;
            }
            int end=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
                
            }
            String word = s.substring(i+1,end+1);
            if(result.length()>0){
                result.append(' ');
            }
            result.append(word);
        }
        return result.toString();
        
    }
}