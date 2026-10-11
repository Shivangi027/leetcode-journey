class Solution {
    public boolean timeRequired(int[] piles , int mid , int h){
    int n = piles.length ;
    long sum = 0 ;
    for(int i = 0 ; i < n ; i++){
    if(piles[i]%mid==0) sum+=piles[i]/mid ;
    else sum += (piles[i]/mid)+1 ;    
    } 
    if(sum<=(long)h) return true ;
    return false ;   
    }
    public int minEatingSpeed(int[] piles, int h) {
    int n = piles.length ;
    int mx = Integer.MIN_VALUE ;
    for(int i = 0 ; i < n ; i++){
        mx = Math.max(piles[i],mx) ;
    } 
    int low = 1 , high = mx ;
    int ans = Integer.MAX_VALUE ;
    while(low<=high){
    int mid = low + (high-low)/2 ;
    if(timeRequired(piles,mid,h)==true){
        ans =  Math.min(ans,mid) ;
        high = mid-1 ;
    } 
    else low = mid+1 ;   
    } 
    return ans ;  
    }
}