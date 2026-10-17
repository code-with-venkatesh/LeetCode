class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalsurplus=0;
        int start_index=0;
        int currentsurplus=0;
        for(int i=0;i<gas.length;i++){
            int net = gas[i]-cost[i];
            totalsurplus+=net;
            currentsurplus+=net;
            if(currentsurplus<0){
                start_index=i+1;
                currentsurplus=0;

            }
        }
        return (totalsurplus>=0)?start_index:-1;
        
    }
}