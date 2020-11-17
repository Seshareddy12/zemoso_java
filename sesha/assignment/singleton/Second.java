package sesha.assignment.singleton;

public class Second {
    String name;
   public static Second setName(String n){
     //Error:Non-static Member Variables cannot be accessed from static method
     name = n;
     return new Second();
   }
    public void printName(){
        System.out.println(name);
    }


}
