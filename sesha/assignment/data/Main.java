package sesha.assignment.data;

public class Main {
    int d;
    char c;

    public void printMemberVariables(){
        //This method works fine because
        //Member variables are by default initialized by default constructor to default values
        System.out.println(d+" "+c);
    }
   /* public void printLocalVariables(){
        int i;
        char ch;
        //Error because local variables are not initialized
        System.out.println(i+" "+ch);
    }*/
}
