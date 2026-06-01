
class Solution {
    public int[] twoSum(int[] nums, int target) {
       int a[][]= new int [nums.length][2];
       for (int i=0; i<nums.length; i++)
       {
        a[i][0]= nums[i];
        a[i][1]= i;
       }
       int n= a.length;
       Arrays.sort(a, (x, y) -> x[0] - y[0]);

       int left=0, ryt= n-1;
       
       while(left<ryt)
       {
        int sum=0;
        sum += a[left][0]+a[ryt][0];

        if(sum==target)
        {
            int b[]= {a[left][1], a[ryt][1]};
            return b;
        }
        else if(sum>target)
        {
            ryt--;
        }
        else{
            left++;
        }
       }
       return new int[] {-1,-1};
    }
}
