class MajorityElement {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) != null ? (map.get(nums[i]) + 1) : 1);
            if ((int)map.get(nums[i]) > nums.length/2) {
                result = nums[i];
                break;
            }
        }
        return result;
    }
}