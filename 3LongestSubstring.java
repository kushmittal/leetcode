class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int right = 0;
        int left = 0;
        int max = 0;
        if(s.length() > 0 ){
            max = 1;
        }
        Set<Character> set = new HashSet<>();
          while(right < s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                int currentMax = set.size();
                if(currentMax > max){
                    max = currentMax;
                }
            } else {
                int currentMax = set.size();
                if(currentMax > max){
                    max = currentMax;
                }
                set.remove(s.charAt(left));
                left = left+1;
            }

        }
        return max;
    }
}
