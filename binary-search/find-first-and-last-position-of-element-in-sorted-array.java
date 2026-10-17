class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        
        int left=checkIndex(nums,target,true);
        if(left==-1 || nums.length<1){
            return new int[] {-1,-1};
        }
        int right=checkIndex(nums,target,false);
        return new int[] {left,right};
        
    }
    public int checkIndex(int[] nums, int target, boolean isFirst){
        int s=0,e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                if(isFirst){
                    if(s==mid || nums[mid-1]!=target){
                        return mid;
                    }
                    else{
                        e=mid-1;
                    }

                }
                else if(e==mid || nums[mid+1]!=target){
                    return mid;
                }
                else{
                    s=mid+1;
                }
            }
            else if(nums[mid]>target){
                e=mid-1;
                
            }
            else{
                s=mid+1;
                
            }
        }
        return -1;
    }
}