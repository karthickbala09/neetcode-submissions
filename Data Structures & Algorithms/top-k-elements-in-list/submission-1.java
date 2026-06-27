class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)-> map.get(a)-map.get(b));
        for(int key:map.keySet()){
            pq.add(key);
        } 
        while(pq.size()>k){
            pq.poll();
        }
        int res[] = new int[pq.size()];
        for(int i=0;i<k;i++){
            res[i] = pq.poll();
        }
        return res;
        
    }
}
