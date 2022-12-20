class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0 && nums[index] == 0) {
                nums[index] = nums[i];
                nums[i] = 0;
                index++;
            }
            if (nums[index] != 0) {
                index++;
            }
        }
    }
}