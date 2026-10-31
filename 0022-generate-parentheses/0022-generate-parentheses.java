
class Solution {
    List<String> ans = new ArrayList<>();

    public void parentheses(int indx, String s, int open, int close,
                            List<String> list, int n) {

        if(open == n && close == n) {
            list.add(s);
            return;
        }

        if(open < n) {
            parentheses(indx + 1, s + "(", open + 1, close, list, n);
        }

        if(close < open) {
            parentheses(indx + 1, s + ")", open, close + 1, list, n);
        }
    }

    public List<String> generateParenthesis(int n) {
        parentheses(0, "", 0, 0, ans, n);
        return ans;
    }
}
