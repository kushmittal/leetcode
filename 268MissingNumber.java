class Solution {
    public int missingNumber(int[] nums) {
        if(nums.length == 1 && nums[0] == 0){
            return 1;
        }
        
        int arrSum = 0;
        for(int i =0 ; i < nums.length; i++){
            arrSum += nums[i];
        }
        
        int n = nums.length + 1;
        int expectedSum = (n * (n -1))/2;
        
        return expectedSum - arrSum;
        
    }
}
