class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] preprod = new int[nums.length];
      preprod[0] = nums[0]  ;
      for(int i = 1;i<nums.length-1;i++){
          preprod[i] = preprod[i-1] * nums[i];
      }
      int suffix = 1;
      int[] ans = new int[nums.length];
      for(int i=nums.length-1;i>=0 ;i-- ){

        if (i==0){
           ans[i] = 1* suffix;
        }
        else{
          ans[i] = preprod[i-1] * suffix;
        }
         suffix = suffix * nums[i];
      }
      return ans;
    }
}