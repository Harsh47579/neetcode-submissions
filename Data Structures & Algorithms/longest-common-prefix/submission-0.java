class Solution {
    public String longestCommonPrefix(String[] strs) {
   
       Arrays.sort(strs);
        int n=strs.length;
        String str="";
        String str1=strs[0];
         int m=str1.length();
        String str2=strs[n-1];
        for(int i=0;i<m;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                str+=str1.charAt(i);
            }
            else{
                break;
            }
        }
        return str;
    }
}