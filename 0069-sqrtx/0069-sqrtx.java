class Solution {
    public int mySqrt(int x) {
    long lo = 1 , hi = (long)x ;
    while(lo<=hi){
    long m = lo + (hi-lo)/2 ;
    if(m*m==x) return (int)m ;
    else if(m*m>x) hi = m-1 ;
    else lo = m+1 ;
    }
    return (int)hi ;    
    }
}