class Solution {
    public int climb(int n , int[] arr){
        if(arr[n] != -1) return arr[n];
        else if(n == 1) 
        {   arr[n] = 1;
            return 1;}
        else if(n == 2) {
            arr[n] = 2;
            return 2;}
        else {
            arr[n] = climb(n-1,arr) + climb(n-2,arr);
            return arr[n];
        }
    }
    public int climbStairs(int n) {
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        return climb(n,arr); 

    }
}