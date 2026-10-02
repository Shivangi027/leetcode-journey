class Solution {
    public List<List<Integer>> fourSum(int[] arr, int t) {
    List<List<Integer>> ans = new ArrayList<>() ; 
    Arrays.sort(arr) ;  
    int n = arr.length ;
    for(int i = 0 ; i < n-3 ; i++){
        if(i>0 && arr[i]==arr[i-1]) continue ;
        for(int j = i+1 ; j < n-2 ; j++){
            if(j>i+1 && arr[j]==arr[j-1])  continue ;
            int k = j+1 ;
            int l = n-1 ; 
            while(k<l){
                long sum = (long)arr[i]+arr[j]+arr[k]+arr[l] ;
                if(sum<t) k++ ;
                else if(sum>t) l-- ;
                else{
                    List<Integer> list = new ArrayList<>() ;
                    list.add(arr[i]) ;
                    list.add(arr[j]) ;
                    list.add(arr[k]) ;
                    list.add(arr[l]) ;
                    Collections.sort(list) ;
                     ans.add(list) ;
                    k++ ;
                    l-- ;
                    while((k<l) && arr[k]==arr[k-1]) k++ ;
                    while((k<l) && arr[l]==arr[l+1]) l-- ;
                }
            }
        }
    }
    return ans ;
    }
}