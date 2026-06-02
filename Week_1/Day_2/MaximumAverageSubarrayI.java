class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum =0.0;
        for(int i=0; i<k; i++)
        {
            sum += nums[i];
        }
        double avg=0.0;
        double maxavg=sum/k;
        for (int i=k; i<nums.length; i++)
        {
            sum = sum+ nums[i] - nums[i-k];
            avg= sum/k;
            maxavg= Math.max(maxavg,avg);
        }
    return maxavg;
    }
}