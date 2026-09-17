class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
int ans[]=new int[k];
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
             map.put(num,map.getOrDefault(num,0)+1);
         }
for(int i=0;i<k;i++){
    int val=0;
    int elem=0;
    for(int key:map.keySet()){
        if(map.get(key)>val){
            val=map.get(key);
            elem=key;
        }
    }
    ans[i]=elem;
    map.remove(elem);
}
return ans;
    }
}
