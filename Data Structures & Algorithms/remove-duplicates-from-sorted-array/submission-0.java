class Solution {
    public int removeDuplicates(int[] nums) {
       int cnt=1;

       int n =nums.length;
       int j=1;
       for(int i=1;i<n;i++){
      
         if(nums[i-1]!=nums[i]){
            nums[j++]=nums[i];
            cnt++;
        }
       }
       
       return cnt;
    }
}