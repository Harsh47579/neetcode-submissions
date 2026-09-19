class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int ans=0;

    int high=n-1;
    int low=0;
    while(low<high){
        int area= Math.min(heights[high],heights[low])*(high-low);
        ans=Math.max(ans,area);
        if(heights[high]>heights[low]){
            low++;
        }
        else{
            high--;
        }
    }
    return ans;
    }
}
