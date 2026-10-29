class Solution {
    public String removeOuterParentheses(String s) {
    int n = s.length() ;
    StringBuilder sb = new StringBuilder("");
    int cnt = 0 ;
    for(char c : s.toCharArray()){
        if(c=='('){
        if(cnt>0) sb.append('(') ;
        cnt += 1 ;
    }   
    else{
        cnt -=1 ;
        if(cnt>0) sb.append(')') ;
    } 
    }
    String ans = sb.toString() ;
    return ans;
    }
}