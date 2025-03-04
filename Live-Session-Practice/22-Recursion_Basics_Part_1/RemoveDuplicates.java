//AMAZON

public class RemoveDuplicates {
    public static void removeDuplicates(String str, int idx, boolean map[], StringBuilder newStr){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            //already present
            removeDuplicates(str, idx+1, map, newStr);
        }else{
            map[currChar-'a'] = true;
            removeDuplicates(str, idx+1, map, newStr.append(currChar));
        }
    }
    public static void main(String[] args) {
        String str = "dnyaneshwar";
        removeDuplicates(str, 0, new boolean[26], new StringBuilder(""));
    }
}
