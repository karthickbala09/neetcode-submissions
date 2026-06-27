class Solution {
    public int[] productExceptSelf(int[] nums) {
        int a[] = new int[nums.length];
        int fact = 1;
        int index =0;
        boolean zero = false;
        int zeroindex=0;
        int zc=0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0){
               zeroindex = i;
               zero=true;
               zc++;
               continue;
            }
            fact*=nums[i];
        } 
        if(zero){

            a[zeroindex] = zc==1?fact:0;
            return a;
        }
       for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                a[i] = 0;
            }
            else{
                a[i] = fact/nums[i];
            }
            
       }
        return a;
    }
}  
