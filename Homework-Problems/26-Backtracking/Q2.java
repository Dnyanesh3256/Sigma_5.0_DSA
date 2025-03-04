/*
Keypad Combinations
*/

public class Q2 {
    final static char[][] L = {
        {},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v'},
        {'w','x','y','z'}
    };

    public static void letterCombinations(String str){
        int len = str.length();

        if(len == 0){
            System.out.println("");
            return;
        }

        bfs(0, len, new StringBuilder(), str);
    }

    public static void bfs(int pos, int len, StringBuilder sb, String str){
        if(pos == len){
            System.out.println(sb.toString());
        }
        else{
            char[] letters = L[Character.getNumericValue(str.charAt(pos))];

            for(int i=0;i<letters.length;i++){
                bfs(pos+1, len, new StringBuilder(sb).append(letters[i]), str);
            }
        }
    }
    public static void main(String[] args) {
        letterCombinations("2");
    }
}
