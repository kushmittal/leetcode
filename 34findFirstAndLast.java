class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{binarySearchMin(nums, 0 , nums.length -1 ,target),
                         binarySearchMax(nums, 0 , nums.length -1 ,target)};
   }
    

    public int binarySearchMin(int[] nums , int start, int end , int target){
        int minIndex = -1;
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(nums[mid] == target){
                end = mid -1;
                minIndex = mid;
            } else if(nums[mid] < target){
                start = mid +1 ;
            } else{
                end = mid -1;
            }
            
        }
        return minIndex;
    }
    
     public int binarySearchMax(int[] nums , int start, int end , int target){
        int maxIndex = -1;
        
        while(start <= end){
            int mid = (start+end)/2;
            
            if(nums[mid] == target){
                start = mid + 1;
                maxIndex = mid;
            } else if(nums[mid] < target){
                start = mid +1 ;
            } else{
                end = mid -1;
            }
            
        }
        return maxIndex;
    }
}
