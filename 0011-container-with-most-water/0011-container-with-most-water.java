class Solution {
    public int maxArea(int[] height) {
        int i = 0 ;
        int j = height.length - 1;
        int max = 0;
        while(i<=j){
        int a =(j-i)*Math.min(height[i],height[j]);
        max = max < a ? a : max;
        if(height[i] > height[j])
        j--;
        else i++;
        }
        return max;
    }
}