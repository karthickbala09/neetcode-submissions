class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> list = new HashSet<>();
        char ch[]=s.toCharArray();
        int first = 0;
        int last = 0;
        int max = 0;
        while(last<s.length()){
            
            while(list.contains(ch[last])){
                
                list.remove(ch[first]);
                first++;
            }
            list.add(ch[last]);
            max = Math.max(max,last-first+1);
            last++;
        }
        System.out.println(list.size());
        return max;
        
        
    }
}
