class Solution {
    public boolean palindrome(int i , int j , String str){ 
    while(i<j){
    if(str.charAt(i) != str.charAt(j))   return false ;
    i++ ; 
    j-- ;
    }
    return true ;
    }
    public boolean isPalindrome(String s) {
    String str = s.replaceAll("[^a-zA-Z0-9]" , "").toLowerCase() ;
    return (palindrome(0,str.length()-1,str)) ;
    }
}