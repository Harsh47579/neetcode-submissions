class Solution {
    public boolean isAnagram(String s, String t) {
int n=s.length();
int m=t.length();
if(n != m)return false;
HashMap<Character,Integer>map=new HashMap<>();
HashMap<Character,Character>map2=new HashMap<>();
// char ch1[]=s.toCharArray();
// char ch2[]=t.toCharArray();
// Arrays.sort(ch1);
// Arrays.sort(ch2);

// if(ch1.length != ch2.length)return false;
// for(int i=0;i<ch1.length;i++){
// if(ch1[i] != ch2[i]){
//     return false;
// }
// }
// return true;
for(int i=0;i<n;i++){
    map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
}
for(int i=0;i<m;i++){
    char ch=t.charAt(i);
    if(!map.containsKey(ch) || map.get(ch)==0){
        return false;
    }
    map.put(ch,map.get(ch)-1);
}
return true;
    }
}
