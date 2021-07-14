/* Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings. */


class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        String result = new String(temp);
        int min = 200;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                temp = strs[i];
                min = strs[i].length();
            }
        }
        int count = 1;
        for (int i = 0; i < strs.length; i++) {
            while (!strs[i].startsWith(result)) {
                result = temp.substring(0, temp.length() - count);
                count++;
            }
            temp = result;
            count = 1;
        }
        return result;
    }
}