class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            // odd length
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left - 1 > len) {
                len = right - left - 1;
                start = left + 1;
            }

            // even length
            left = i; right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            if (right - left - 1 > len) {
                len = right - left - 1;
                start = left + 1;
            }
        }
        return s.substring(start, start + len);
    }
}