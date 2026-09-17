class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> openlist = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        permu(nums,openlist,new ArrayList<>(),freq);
        return openlist; 
    }
    public static void permu(int arr[] , List<List<Integer>> openlist ,ArrayList<Integer> list , boolean freq[]){
        if(list.size()==arr.length){
            openlist.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i] = true;
                list.add(arr[i]);
                permu(arr,openlist,list,freq);
                freq[i] = false;
                list.remove(list.size()-1);
            }
        }
    }
}
