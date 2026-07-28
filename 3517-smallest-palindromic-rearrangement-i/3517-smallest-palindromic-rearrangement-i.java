class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        int[] ch = new int[26];
        for(char c : s.toCharArray()){
            ch[c-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            while (ch[i] >= 2) {
                left.append((char)('a' + i));
                ch[i] -= 2;
            }
        }

        right.append(left).reverse();

        StringBuilder ans = new StringBuilder();
        ans.append(left);

        for (int i = 0; i < 26; i++) {
            if (ch[i] == 1) {
                ans.append((char)('a' + i));
                break;
            }
        }

        ans.append(right);

        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna