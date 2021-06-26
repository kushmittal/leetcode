class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length -1;
        int max = 0;
         while(i < j){
            if(height[i] <= height[j]){
                int currMax = ((j-i) ==0 ? 1:j-i)  * Math.min(height[i], height[j]);

                if(currMax > max){
                    max = currMax;
                }
                i++;
            } else  if(height[i] > height[j]){
                int currMax = ((j-i) ==0 ? 1:j-i) * Math.min(height[i], height[j]);
                if(currMax > max){
                    max = currMax;
                }
                j--;
            }
        }
        
        return max;
    }
}
