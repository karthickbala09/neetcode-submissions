class Solution {
    public boolean isPalindrome(String s) {
        String org = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int right = 0;
        int left = org.length()-1;
        while(right<left){
            if(org.charAt(right)==org.charAt(left)){
                right++;
                left--;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}
