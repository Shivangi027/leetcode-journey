class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int n = nums.length ;
    int j= 0  , count = 0 , max = 0 ;  
    while(j<n){
        if(nums[j]==1){
            count++;
            j++;
        }
        else{
            max = Math.max(max,count);
            count = 0 ;
            j++;
        }
    }
    max = Math.max(max,count);
    return max ; 
    }
}