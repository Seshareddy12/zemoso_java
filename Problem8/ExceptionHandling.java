package Problem8;

import java.io.IOException;
import java.util.Random;

class MyException extends Exception{
    int id;
    MyException(int id){
        this.id=id;
    }
    public String getMessage(){
        return "My Exception ["+id+"]";
    }
}
public class ExceptionHandling {
    public static void exceptionGenerator() throws MyException,ArrayIndexOutOfBoundsException,NullPointerException{
        Random rand = new Random();
        int randomNumber = rand.nextInt(3);
        if(randomNumber==0){
            throw new MyException(5);
        }
        else if(randomNumber==1){
            int res = 1/0;
        }
        else
        {
            String s=null;
            s.length();
        }

    }
    public static void main(String args[]) throws IOException{
        try {
            exceptionGenerator();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Executing finally");
        }
    }
}
