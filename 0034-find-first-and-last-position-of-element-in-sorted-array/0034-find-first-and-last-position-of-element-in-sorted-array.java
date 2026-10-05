class Solution {
    public int[] searchRange(int[] nums, int t) {
    int n = nums.length ;
    boolean flag = false ;
    int[] ans = {-1,-1} ;
    int lb = n ;
    int low = 0 , high = n-1 ;
    while(low <= high){
        int mid = low + (high-low)/2 ;
        if(nums[mid]==t){ 
        flag = true ;
        break ;
        }
        else if(nums[mid]>t) high = mid-1 ;
        else low = mid+1 ;
    } 
    if(flag==false) return ans ;
    low = 0 ;
    high = n-1 ;
    while(low <= high){
        int mid = low + (high-low)/2 ;
        if(nums[mid]>=t){ 
        lb = Math.min(lb,mid) ;
        high = mid-1 ;
        }
        else low = mid+1 ;
    } 
    ans[0] = lb ;
    int ub = n ;
    low = 0 ;
    high = n-1 ;
    while(low<=high){
        int mid =low + (high-low)/2 ;
        if(nums[mid]>t){
        ub = Math.min(ub,mid);
        high = mid-1 ;
        }
        else low = mid+1 ;
    }
    ans[1] = ub-1 ;
    return ans ;
    }
}