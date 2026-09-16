class Solution {
    public int majorityElement(int[] arr) {
    int n = arr.length ;  
    int elem = arr[0]; int count = 0 ;
    for(int i = 0 ; i < n ; i++){
        if(count == 0){
            count = 1 ;
            elem = arr[i] ;
        }
        else if(elem == arr[i]){
            count++ ;
        }
        else{
            count-- ;
        }
    }
    count = 0 ;
    for(int i = 0 ; i < n ; i++){
        if(arr[i]==elem)    count++ ;
    }
    if(count > n/2)  
    return elem ;
    return 1 ;
    }
}