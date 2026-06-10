
class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Lengths must match
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Convert to char arrays
        char[] Sarr = s.toCharArray();
        char[] Tarr = t.toCharArray();

        // Step 3: Sort both arrays
        Arrays.sort(Sarr);
        Arrays.sort(Tarr);

        // Step 4: Compare sorted arrays
        return Arrays.equals(Sarr, Tarr);
    }
}
