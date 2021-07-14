/*

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.

*/

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 1 && nums[0] == val) {
            return 0;
        }
        int result = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            while (i < nums.length && nums[i] != val) {
                i++;
            }
            while (j >= 0 && nums[j] == val) {
                j--;
            }
            if (i < j && nums[i] == val && nums[j] != val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
        }
        return j + 1;
    }
}