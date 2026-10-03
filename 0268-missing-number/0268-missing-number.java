class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int actualsum=0;
        sum=n*(n+1)/2;
        for(int i=0;i<nums.length;i++)
        {
            actualsum+=nums[i];
        }
        return (sum-actualsum);
    }
}