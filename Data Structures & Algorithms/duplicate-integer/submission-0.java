class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer>set=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        if(set.size()==n){
            return false;
        }
        return true;
    }
}