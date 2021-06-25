class Solution {
    public String largestNumber(int[] nums) {
        
        String[] arr = new String[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            arr[i] = String.valueOf(nums[i]);
        }
        
          Arrays.sort(arr, new Comparator<String>()
        {
            @Override public int compare(String X, String Y)
            {
                String XY = X + Y;
                String YX = Y + X;

                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });

        String output = "";
        int zeroCount  = 0;
        for(int i = 0 ; i < arr.length; i++){
            output += arr[i];
            if(arr[i].equals("0")){
                zeroCount++;
            }
        }
        if(zeroCount == arr.length){
            return "0";
        }
        return output;
    }
}
