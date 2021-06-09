class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        else {
            int p1 = 0, p2 = 1;
            while (p2 < nums.length) {
                if (nums[p2] > nums[p1]) {
                    p1++;
                    int temp = nums[p2];
                    nums[p2] = nums[p1];
                    nums[p1] = temp;
                }
                p2++;
            }
            return (p1 + 1);
        }
    }
}