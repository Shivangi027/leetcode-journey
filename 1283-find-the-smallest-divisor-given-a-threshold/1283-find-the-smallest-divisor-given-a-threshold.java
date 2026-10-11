class Solution {
    public boolean isLess(int[] nums,int mid,int t){
    int n = nums.length ;    
    int sum = 0 ;
    for(int i = 0 ; i< n ; i++){
        if(nums[i]%mid==0)
        sum += nums[i]/mid ;
        else  
        sum += nums[i]/mid+1;
    }  
    if(sum<=t) return true ;  
    return false ;
    }
    public int smallestDivisor(int[] nums, int threshold) {
    int n = nums.length ;
    int mx = Integer.MIN_VALUE ;
    for(int i = 0 ; i < n ; i++){
        mx = Math.max(mx,nums[i]);
    } 
    int low = 1 , high = mx ;
    int ans = Integer.MAX_VALUE ;
    while(low<=high){
    int mid = low + (high-low)/2 ;
    if(isLess(nums,mid,threshold)==true){
        ans = Math.min(ans,mid) ;
        high = mid-1 ;
    }
    else low = mid+1 ;
    }
    return ans ;  
    }
}