// link to the problem https://leetcode.com/problems/merge-strings-alternately/description/
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int j=0,i=0;
        String word3="";
        while(i<word1.length() && j<word2.length()){
            word3+=word1.charAt(i++);
            word3+=word2.charAt(j++);
        }
        while(i<word1.length()){
             word3+=word1.charAt(i++);
        }

        while(j<word2.length()){
             word3+=word2.charAt(j++);
        }
        return word3;
    }
}
// Time Complexity: O(n), where n is the length of the longer string (word1 or word2).
// Space Complexity: O(n), where n is the length of the resulting merged string (word3).