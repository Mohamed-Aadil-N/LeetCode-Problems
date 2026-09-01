class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_size = s.length();
        int t_size = t.length();
        int small = 0;
        int large = 0;
        while(small < s_size && large < t_size){
            if(s.charAt(small) == t.charAt(large)){
                small++;
            }
            large++;
        }
        return small == s.length();
    }
}