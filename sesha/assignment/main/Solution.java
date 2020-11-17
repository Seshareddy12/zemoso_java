package sesha.assignment.main;
import sesha.assignment.data.Main;
import sesha.assignment.singleton.Second;

public class Solution {
    public static void main(String args[])
    {
        Main m = new Main();
        m.printMemberVariables();
        m.printLocalVariables();
        Second s = Second.setName("sesha");
        s.printName();
    }
}
