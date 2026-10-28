class Solution {
    public boolean rotateString(String s, String goal) {
    if(goal.length()!=s.length())   return false ;
    String doubledS = s+s ;
    int n = s.length() ;
    for(int i = 0 ; i < n ; i++){
        if(doubledS.contains(goal)) return true ;
    } 
    return false ;   
    }
}