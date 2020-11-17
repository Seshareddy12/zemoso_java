package First;

import java.util.HashSet;

public class CharCount {
    public static boolean checkAlphabet(String s){
        HashSet<Character> set = new HashSet<>();
        //Because of this single loop which iterates entire String
        // Time Complexity is O(n)
        for(int i=0;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                set.add(Character.toLowerCase(c));
            }
        }
        //Here we are using set,which doesn't exceed size 26 (Because we are only adding letters into it)
        //So,space complexity is O(1)
        return set.size()==26;
    }
    public static void main(String args[]){
        String input1="abcde";
        System.out.println(checkAlphabet(input1));
        input1 = "abcdefghijklmnopqrstuvWXYZ";
        System.out.println(checkAlphabet(input1));
    }
}
