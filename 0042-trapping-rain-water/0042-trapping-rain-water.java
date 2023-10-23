class Solution {
    public int trap(int[] height) {
        int len = height.length;
        int[] preMax= new int[len];
        int[] suffixMax = new int[len];
        preMax[0] = height[0];
        suffixMax[len-1] = height[len-1];
        for(int i=1;i<len-1;i++){
            preMax[i] = Math.max(preMax[i-1],height[i]);
        }
        for(int i=len-2;i>=0;i--){
            suffixMax[i] = Math.max(suffixMax[i+1],height[i]);
        }
        int amt = 0;
        for(int i=0;i<len-1;i++){
           int yb = Math.min(preMax[i],suffixMax[i]) - height[i];
           if(yb < 0){
               amt+=0;
           }
           else{
               amt = amt+yb;
           } 
        }
    return amt;
    }
}