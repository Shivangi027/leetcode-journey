class Solution {
    public boolean isPossible(int[] arr , int mid , int d){
        int n = arr.length ;
        int cnt = 1 , sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            if(sum+arr[i]<=mid) sum += arr[i] ; 
            else{ 
                cnt++ ;
                sum = arr[i] ;
        }
        }
        if(cnt<=d)
        return true ; 
        else
        return false ;

}
    public int shipWithinDays(int[] arr, int d) {
     int n = arr.length ;
     int sum = 0 , mx = Integer.MIN_VALUE ;
     for(int i = 0 ; i < n ; i++){
        sum += arr[i] ;
        mx = Math.max(mx,arr[i]) ;
     }
     int lo = mx , hi = sum , c = Integer.MAX_VALUE ;
     while(lo<=hi){
        int mid = lo + (hi-lo)/2 ;
        if(isPossible( arr, mid , d)){
            c = mid ;
            hi = mid-1 ;
        }
        else
        lo = mid+1 ;
     }
     return c ;
    }
}