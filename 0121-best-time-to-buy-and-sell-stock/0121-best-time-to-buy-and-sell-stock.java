class Solution {
    public int maxProfit(int[] arr) {
    int n = arr.length ;
    int min = arr[0] ;
    int profit = 0 , cost = 0 ;
    for(int i = 0 ; i < n ; i++){
        cost = arr[i]-min ;
        profit = Math.max(profit,cost) ;
        min = Math.min(arr[i],min) ;
    }
    return profit ;   
    }
}