class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int[] maxLeft = new int[length];
        int[] maxRight = new int[length];
        int currMax = 0;
        for(int i = 0 ; i < length; i++){
            if(height[i] > currMax){
                maxLeft[i] = currMax;
                currMax = height[i];
            } else {
                maxLeft[i] = currMax;
            }
        }
        currMax = 0;
        for(int i = length -1  ; i >= 0; i--){
            if(height[i] > currMax){
                maxRight[i] = currMax;
                currMax = height[i];
            } else {
                maxRight[i] = currMax;
            }
        }
        int capacity = 0;
        for(int i = 1 ; i < length; i++){
            if(Math.min(maxLeft[i], maxRight[i]) > height[i]){
                capacity += Math.min(maxLeft[i], maxRight[i]) - height[i];
            }
        }
        return capacity;
    }
}
