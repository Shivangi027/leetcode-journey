class Solution {
    public List<Integer> getRow(int r) {
     List<Integer> arr = new ArrayList<>() ;  
     arr.add(1) ;  
     if(r==0) return arr ;
     long ans = 1 ;
     for(int i = 1 ; i <= r ; i++){
            ans = ans*(r-i+1) ;
            ans = ans/i ;
            arr.add((int)ans) ;  
        }
        return arr;     
    }
}