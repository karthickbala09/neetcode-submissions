class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sublist = new ArrayList<>();
        cs(nums,0,sublist,new ArrayList<>());
        return sublist;
    }
    public static void cs(int arr[],int index,List<List<Integer>> list,ArrayList<Integer> sublist){

        if(index==arr.length){
            list.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(arr[index]);
        cs(arr,index+1,list,sublist);
        sublist.remove(sublist.size()-1);
        cs(arr,index+1,list,sublist);
    }
}
