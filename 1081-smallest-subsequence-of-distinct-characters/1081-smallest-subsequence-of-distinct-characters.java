class Solution {
    public String smallestSubsequence(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0 ; i<s.length() ; i++) map.put(s.charAt(i),i);

        HashSet<Character> set = new HashSet<>();
        Stack<Character> stk = new Stack<>();

        int i=0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                i++;
                continue;
            }
            while(!stk.isEmpty() && c<stk.peek() && i<map.get(stk.peek())){
                set.remove(stk.pop());
            }

            set.add(c);
            stk.add(c);
            i++;
        }

        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }

        return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna