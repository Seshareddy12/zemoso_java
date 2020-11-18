package Second;
import edu.duke.FileResource;

import java.io.*;
import java.util.HashMap;

public class CountCharacters {
    public static void main(String args[]) {

        FileResource fr = new FileResource(args[0]);
        HashMap<Character, Integer> characterMap = new HashMap<>();
        for (String s : fr.lines()) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if(characterMap.get(ch)==null){
                    characterMap.put(ch,1);
                }
                else
                {
                    characterMap.put(ch, characterMap.get(ch)+1);
                }

            }
        }

        try{

            FileWriter myWriter = new FileWriter("D:/Assignments/output");
            for(Character ch: characterMap.keySet()){
                myWriter.write("Character "+ch+" occured "+characterMap.get(ch)+" times.\n");
            }
            myWriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
