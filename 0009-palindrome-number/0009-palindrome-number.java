class Solution {
    public boolean isPalindrome(int x) {
    if(x<0) return false ;
    int n = x ;
    int rem = 0 , rev = 0 ;
    while(n!=0){
    rem = n%10;
    rev = rev*10+rem ;
    n=n/10;    
    }
    if(x==rev) return true ;
    return false ;    
    }
}