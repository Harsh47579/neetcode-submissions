class Solution {
    public int longestConsecutive(int[] nums) {
        int cnt=1;
        int count=1;
        int n=nums.length;
        Arrays.sort(nums);
        if (nums.length == 0) return 0;
      for(int i=1;i<n;i++){
if(nums[i]==nums[i-1])continue;
if(nums[i]==nums[i-1]+1){
  cnt++;
}
else{
  cnt=1;
}
 count=Math.max(cnt,count);
      }
     
      return count;
    }
}
