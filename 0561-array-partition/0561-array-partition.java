class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        int i=0;
        while(i<n){
            sum = sum + nums[i];
            i += 2;
        }
        return sum;
    }
}