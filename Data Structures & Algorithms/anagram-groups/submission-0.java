class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(String val:strs){
            char arr[] = val.toCharArray();
            Arrays.sort(arr);
            String sb = new String(arr);
            map.computeIfAbsent(sb, k -> new ArrayList<>()).add(val);  
        }
        System.out.println(map);
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
        
    }
}
