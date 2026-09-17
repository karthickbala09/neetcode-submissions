class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> openlist = new ArrayList<>();
        Set<List<Integer>>  openset = new HashSet<>();
        sd(0,nums,openset,new ArrayList<>());
        openlist.addAll(openset);
        return openlist;

        
    }
    public static  void sd(int index,int arr[],Set<List<Integer>> openlist, ArrayList<Integer> list){
        if(index == arr.length){
            openlist.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        sd(index+1,arr,openlist,list);
        list.remove(list.size()-1);
        sd(index+1,arr,openlist,list);
    }
}
