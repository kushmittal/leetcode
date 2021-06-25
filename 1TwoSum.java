class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> mapCounts = new HashMap<Integer, Integer>();     
        for(int i = 0 ; i < nums.length; i++){
            int tar = target;
            Integer num = mapCounts.get(nums[i]);
            if(num == null){
                tar = tar - nums[i];
                if(mapCounts.containsKey(tar)){
                    return new int[] { mapCounts.get(tar), i};
                }
                mapCounts.put(nums[i], i);
            } else {
                tar = tar - nums[i];
                if(mapCounts.containsKey(tar)){
                    return new int[] { mapCounts.get(tar), i};
                }
            }
            
        }
        return new int[] {0,0};
    }
}
