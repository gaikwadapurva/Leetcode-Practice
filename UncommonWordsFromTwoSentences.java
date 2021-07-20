/* A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

 

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]

*/

class UncommonWordsFromTwoSentences {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        String str1[] = s1.split(" ");
        for (int i = 0; i < str1.length; i++) {
            if (map.get(str1[i]) == null) {
                count++;
            }
            else if (map.get(str1[i]) == 1) {
                count--;
            }
            map.put(str1[i], map.get(str1[i]) == null ? 1 : map.get(str1[i]) + 1);
        }
        String str2[] = s2.split(" ");
        for (int i = 0; i < str2.length; i++) {
            if (map.get(str2[i]) == null) {
                count++;
            }
            else if (map.get(str2[i]) == 1) {
                count--;
            }
            map.put(str2[i], map.get(str2[i]) == null ? 1 : map.get(str2[i]) + 1);
        }
        System.out.println(count);
        String result[] = new String[count];
        Iterator itr = map.entrySet().iterator();
        int index = 0;
        while (itr.hasNext()) {
            Map.Entry mapElement = (Map.Entry)itr.next();
            if ((int)mapElement.getValue() == 1) {
                result[index++] = (String)mapElement.getKey();
            }
        }
        return result;
    }
}