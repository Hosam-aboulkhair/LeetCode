class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
        for(int i  = 0; i < nums.length; i++){
            int missingVal = target - nums[i];
            if(map.containsKey(missingVal)){
                return new int[] {map.get(missingVal), i};
            }
            map.put(nums[i],i);
        }
         return new int[] {};
    }
}
