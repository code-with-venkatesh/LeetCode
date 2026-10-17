class Solution {
    public int secondHighest(String s) {
        int largest =-1,secondLargest=-1;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit = ch-'0';
                if(digit>largest){
                    secondLargest=largest;
                    largest=digit;
                }
                else if(digit>secondLargest && digit!=largest){
                    secondLargest=digit;
                }
            }
            
        }
        return secondLargest;
    }
}