class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int product = 1;
        int zeroCount = 0;
        int[] output = new int[nums.length]; 
        for(int i =0 ; i < nums.length; i++){
            if(nums[i] != 0){
                product = product * nums[i];
            }
            else {
                zeroCount++;
            }
        }
             
        System.out.println(product);
        for(int i =0 ; i < nums.length; i++){
            if(zeroCount > 1){
                output[i] = 0;
            }
            else if(zeroCount == 1 &&  nums[i] != 0){
                output[i] = 0;
            }
            else if(zeroCount == 0){
                    output[i] =  product/ nums[i];
            } else {
                output[i] =  product;
            }
                
        }
            return output;
        }
          
}
