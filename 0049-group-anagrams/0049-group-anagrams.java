class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> res = new ArrayList<>();
        boolean[] isChecked = new boolean[n]; 

        for (int i = 0; i < n; i++) {
            if (isChecked[i]) continue; // Skip if already grouped
            
            List<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            isChecked[i] = true;
            
            // Find its anagrams in the rest of the array
            for (int j = i + 1; j < n; j++) {
                if (!isChecked[j] && isAnagram(strs[i], strs[j])) {
                    curr.add(strs[j]);
                    isChecked[j] = true; // Mark as grouped
                }
            }
            res.add(curr);
        }
        return res;
    }

    private boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        
        int[] arrA = new int[26];
        int[] arrB = new int[26];
        for (int i = 0; i < a.length(); i++) {
            arrA[a.charAt(i) - 'a']++;
            arrB[b.charAt(i) - 'a']++;
        }
        return Arrays.equals(arrA, arrB);
    }
}