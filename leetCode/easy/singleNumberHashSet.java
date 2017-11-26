class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> duplicates = new HashSet<Integer>();
        
        if( nums.length == 0) return -1;
        if( nums.length == 1) return nums[0];
        
        for(int i = 0; i < nums.length; i++) {
            if(duplicates.contains(nums[i]) == true) duplicates.remove(nums[i]);
            else duplicates.add(nums[i]);
        }
        
        if(duplicates.isEmpty() != true) return duplicates.iterator().next();
        
        return -1;
    }
}
