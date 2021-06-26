class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
                while(i < j){
            System.out.println(s.charAt(i));
            System.out.println(s.charAt(j));
            if(!Character.isLetterOrDigit(s.charAt(i))  && !Character.isLetterOrDigit(s.charAt(j))){
                i++; j--;
            } else if(!Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))){
                i++;
            } else if( Character.isLetterOrDigit(s.charAt(i)) && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            } else if(Character.toLowerCase(s.charAt(i)) ==  Character.toLowerCase(s.charAt(j))){
                i++; j--;
            } else{
                return false;
            }
        }
        return true;
    }
}
