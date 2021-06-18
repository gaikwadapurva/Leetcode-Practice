class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int pos = 0;
        while (pos < nums.length && nums[pos] < target) {
            pos++;
        }
        return pos;
    }
}