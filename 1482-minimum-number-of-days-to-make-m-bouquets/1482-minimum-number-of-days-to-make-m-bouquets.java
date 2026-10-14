class Solution {
    public boolean isPossible(int[] arr, int day,int m,int k){
        int n = arr.length ;
        int cnt = 0 , bouquet = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(arr[i]<=day) cnt++ ;
            else{
                bouquet = bouquet+(cnt/k) ;
                cnt = 0 ;
            }
        }
        bouquet = bouquet+(cnt/k) ;
        if(bouquet>=m) return true ;
        return false ;
    }
    public int minDays(int[] bloomDay, int m, int k) {
    int n = bloomDay.length ;
    if(m*k > n) return -1 ;
    int max = Integer.MIN_VALUE , min = Integer.MAX_VALUE;
    for(int i = 0 ; i < n ; i++){
        max = Math.max(bloomDay[i],max) ;
        min = Math.min(bloomDay[i],min) ;
    }
    int ans = -1 ;
    int low = min , high = max ;
    while(low<=high){
    int mid = low + (high-low)/2 ;
        if(isPossible(bloomDay,mid,m,k)==true){
        ans =  mid ;
        high = mid-1 ;
        }
        else low = mid+1 ;
    }
    return ans ;
    }
}