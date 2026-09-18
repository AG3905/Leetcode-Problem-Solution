class Solution {

    public List<String> maxNumOfSubstrings(String s) {

        int n = s.length();

        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, -1);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {

            int c = s.charAt(i) - 'a';

            if (first[c] == -1) {
                first[c] = i;
            }

            last[c] = i;
        }

        List<int[]> valid = new ArrayList<>();

        // Generate valid intervals
        for (int c = 0; c < 26; c++) {

            if (first[c] == -1)
                continue;

            int start = first[c];
            int end = last[c];

            boolean isValid = true;

            for (int j = start; j <= end; j++) {

                int current = s.charAt(j) - 'a';

                if (first[current] < start) {
                    isValid = false;
                    break;
                }

                end = Math.max(end, last[current]);
            }

            if (isValid) {
                valid.add(new int[]{start, end});
            }
        }

        Collections.sort(valid, (a, b) -> a[1] - b[1]);

        List<String> result = new ArrayList<>();

        int prevEnd = -1;

        for (int[] range : valid) {

            int start = range[0];
            int end = range[1];

            if (start > prevEnd) {

                result.add(s.substring(start, end + 1));

                prevEnd = end;
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna