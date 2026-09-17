class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> openlist = new ArrayList<>();
        cs(0,nums,target,new ArrayList<>(),openlist);
        return openlist;
    }
    public static void cs(int index, int arr[] , int target , ArrayList<Integer> list , List<List<Integer>> openlist){
        if(index==arr.length){
            if(target==0){
                openlist.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            cs(index,arr,target-arr[index],list,openlist);
            list.remove(list.size()-1);
        }
        cs(index+1,arr,target,list,openlist);
    }
}
