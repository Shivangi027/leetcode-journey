class Solution {
    public int[] rearrangeArray(int[] arr) {
    int n = arr.length ;
    int[] ans = new int[n] ; 
    int negIndx = 1 , posIndx = 0  ;
    for(int i = 0 ; i < n ;i++){
        if(arr[i]<0){
             ans[negIndx] = arr[i] ;
             negIndx += 2 ;    
        }   
        else{
            ans[posIndx] = arr[i] ;
             posIndx += 2 ; 
        }
    }
    return ans ;
    }
}