/*

Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
Example 2:

Input: n = 3
Output: [-1,0,1]
Example 3:

Input: n = 1
Output: [0]

*/

class FindNUniqueIntegersSumUpToZero {
    public int[] sumZero(int n) {
        int result[] = new int[n];
        int i = 1, j = -1, index = 0;
        if (n % 2 != 0) {
            result[index] = 0;
            index++;
            n--;
        }
        while (n > 0) {
            result[index] = i;
            result[index+1] = j;
            index += 2;
            n -= 2;
            i++;
            j--;
        }
        return result;
    }
}