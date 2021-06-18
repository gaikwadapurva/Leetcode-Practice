class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[n*2];
        int index = 0;
        for (int i = 0, j = n; i < n && j < 2*n; i++, j++) {
            result[index++] = nums[i];
            result[index++] = nums[j];
        }
        return result;
    }
}