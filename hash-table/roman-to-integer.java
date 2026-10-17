class Solution {
    public int romanToInt(String s) {
        HashMap<String,Integer> values = new HashMap<>();
        values.put("I",1);
        values.put("V",5);
        values.put("X",10);
        values.put("L",50);
        values.put("C",100);
        values.put("D",500);
        values.put("M",1000);
        values.put("IV",4);
        values.put("IX",9);
        values.put("XL",40);
        values.put("XC",90);
        values.put("CD",400);
        values.put("CM",900);
    int i=0;
    int sum=0;
    while(i<s.length()){
        if(i<s.length()-1){
            String twochar=s.substring(i,i+2);
            if(values.containsKey(twochar)){
                sum+=values.get(twochar);
                i=i+2;
                continue;
            }
            

        }
        String onechar = s.substring(i,i+1);
        if(values.containsKey(onechar)){
            sum+=values.get(onechar);
            i+=1;
        }
        
    }
    return sum;
        
    }
}