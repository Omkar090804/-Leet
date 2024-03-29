class RemoveDuplicatesfromSortedArray{
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int index = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        nums[index] = nums[n - 1];
        index++;
        return index;
    }
}
