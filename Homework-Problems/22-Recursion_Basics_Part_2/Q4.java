/*
We are given a string S, we need to find the count of all contiguous substrings starting 
and ending with the same character
*/

public class Q4 {
    public static int countSubStr(String str, int si, int ei){
        if(si > ei){
            return 0;
        }

        int firstCharRemove = countSubStr(str, si+1, ei);
        int lastCharRemove = countSubStr(str, si, ei-1);
        int firstAndLastCharRemove = countSubStr(str, si+1, ei-1);

        int ans = firstCharRemove + lastCharRemove - firstAndLastCharRemove;

        return ans;
    }
    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(countSubStr(str, 0, str.length()));
    }
}
