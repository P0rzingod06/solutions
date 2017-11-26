class Solution {
    public int singleNumber(int[] nums) {
        int index = 0;
        Arrays.sort(nums);
        
        while(index < nums.length) {
            if(nums[index] != nums[index + 1]) return nums[i];
            index += 2;
        }
        
        return -1;
    }
}
