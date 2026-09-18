class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(s[i]);
        }
        int j=0;
        while(!stack.isEmpty()){
s[j++]=stack.pop();
        }
    }
}