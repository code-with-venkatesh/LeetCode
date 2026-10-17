class Solution {
    public boolean isHappy(int n) {
        int slow =n;
        int fast =n;
        do{
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }while(slow!=fast);

        return slow==1;
    }

    public int getNext(int x){
        int sum=0;
        while(x>0){
        int digit=x % 10;
        
        sum+=digit*digit;
        x=x/10;
        }   
        return sum; 

    }    
    
}