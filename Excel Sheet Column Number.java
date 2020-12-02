class Solution {
    public int titleToNumber(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            char a = s.charAt(i);
            int x =((int)a)-64;
            sum =sum*26 + x;
        }
        return sum;  
    }
}
