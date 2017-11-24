class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> complementMap = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            if(complementMap.containsKey(nums[i])) {
                return new int[] {complementMap.get(nums[i]),i}; //constructor for array.
            }
            complementMap.put(target - nums[i],i);
        }
        throw new IllegalArgumentException("No solution");
    }
}

