class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i)==')'){
                StringBuilder sb = new StringBuilder();
                int j=i;
                while(j>=0 && stk.peek()!='('){
                    sb.append(stk.pop());
                }
                if(stk.peek()=='(') stk.pop();
                for(char c : sb.toString().toCharArray()){
                    stk.push(c);
                }
            }else{
                stk.push(s.charAt(i));
            }
        }

        StringBuilder res = new StringBuilder();
        for(char c : stk) res.append(c);
        return res.toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna