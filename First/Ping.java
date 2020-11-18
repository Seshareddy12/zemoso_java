package First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ping {
    public static int pingTime(ArrayList<String> commands) throws IOException {
        ProcessBuilder pb = new ProcessBuilder(commands);
        Process p = pb.start();
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String s=null;
        ArrayList<Integer> al = new ArrayList<>();
        while ((s = stdInput.readLine()) != null)
        {
            int index = s.indexOf("time");
            if(index!=-1)
            {

                String time = s.substring(index+5,index+7);
                Pattern pat = Pattern.compile("[0-9]+");
                Matcher m = pat.matcher(time);
                if(m.matches()){
                    al.add(Integer.parseInt(time));
                }
            }
        }
        Collections.sort(al);
        int length = al.size();
        if(length%2==0){
            return (al.get(length/2)+al.get(length/2 - 1))/2;
        }
        else
        {
            return al.get(length/2);
        }

    }
    public static void main(String args[]) throws IOException{
        ArrayList<String> commands = new ArrayList<>();
        commands.add("ping");
        commands.add("www.google.com");

        System.out.println("Median time of Ping is "+pingTime(commands)+"ms");
    }
}
