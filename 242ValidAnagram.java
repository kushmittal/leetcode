/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> mapCounts = new HashMap<>();
        boolean isAnagram = false;
        if(s.length() != t.length()){
            return false;
        }
        
        
        for(int i = 0 ; i < s.length(); i++){
            Integer num = mapCounts.get(s.charAt(i));
            if(num == null){
                mapCounts.put(s.charAt(i), 1);
            } else {
                mapCounts.put(s.charAt(i), ++num);
            }
        }
        
        for(int i = 0 ; i < t.length(); i++){
            Integer num = mapCounts.get(t.charAt(i));
            if(num == null){
                isAnagram = false;
                break;
            } else {
                System.out.println(num);
                mapCounts.put(t.charAt(i), --num);
                if(num == 0){
                    mapCounts.remove(t.charAt(i));
                }

            }
        }
        
        if(mapCounts.size() == 0){
            isAnagram = true;
        }
        return isAnagram;
    }
}
