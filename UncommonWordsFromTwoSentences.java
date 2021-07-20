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
        String temp[] = (s1 + " " + s2).split(" ");
        Arrays.sort(temp);
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        while (i < temp.length) {
            int count = 1;
            while (i < temp.length && (i + 1) < temp.length && temp[i].equals(temp[i+1])) {
                i++;
                count++;
            }
            if (count == 1) {
                result.add(temp[i]);
            }
            i++;
        }
        Object[] objArr = result.toArray();
        return Arrays.copyOf(objArr, objArr.length, String[].class);
    }
}