class Solution {
    public boolean isPossible(int[] arr,int max , int k){
    int n = arr.length ;
    int sum = 0 , cnt = 1  ;
    for(int i = 0 ; i < n ; i++){
        if(sum + arr[i] <= max)
        sum += arr[i]  ;
        else{
            sum = arr[i] ;
            cnt += 1 ;
        }
    } 
    if(cnt<=k) return true ;
    return false ;   
    }
    public int splitArray(int[] nums, int k) {
    int n = nums.length ;
    int sum = 0 , max = Integer.MIN_VALUE ;
    for(int i = 0 ; i < n ; i++){
        sum += nums[i] ;
        max = Math.max(max,nums[i]) ;
    }
    int low = max , high = sum ;
    int ans = -1 ;
    while(low<=high){
    int mid = (low +high)/2 ;
    if(isPossible(nums,mid,k)){
        ans = mid ;
        high = mid-1 ;
    }   
    else low = mid+1 ;
    } 
    return low ;
    }
}