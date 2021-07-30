/*

Given a string s, remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, and return the new string.

Example 1:

Input: s = "leetcodeisacommunityforcoders"
Output: "ltcdscmmntyfrcdrs"
Example 2:

Input: s = "aeiou"
Output: ""

*/

class RemoveVowelsFromString {
    public String removeVowels(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch: s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}