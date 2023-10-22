class Solution {
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for(int i = 1 ;i< nums.length;i++){
            pre[i] = pre[i-1]+nums[i];
        }
        if( 0 == pre[nums.length-1] - pre[0]){
            return 0 ;
        }
 
        for(int i = 1 ;i< nums.length-1;i++){
            int left = pre[i-1];
            int right = pre[nums.length-1] - pre[i];
            if(left == right){
                return i;
            }
        }
             if( pre[nums.length-2] == 0)
            {
                return nums.length -1;
            }
        return -1;

    }
}