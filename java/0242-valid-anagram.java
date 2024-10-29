class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) if (n != 0) return false;

        return true;
    }
}

------------------------------------------------------------------
  class Solution {
    public boolean isAnagram(String s, String t) {
        s = s.toLowerCase();
         t = t.toLowerCase();
     char[] word1 = s.toCharArray();
     char[] word2 = t.toCharArray();
     java.util.Arrays.sort(word1);
     java.util.Arrays.sort(word2);
     return java.util.Arrays.equals(word1,word2);
    }
}
