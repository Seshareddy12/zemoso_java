package Problem6;

public class ConstructorExample {
    String name;
    ConstructorExample(String name){
        this.name = name;
        System.out.println("In the constructor");
    }
    public static void main(String args[]){
        ConstructorExample example[]=new ConstructorExample[5];
        //Constructor not called while creating array of references

        for(int i=0;i<5;i++){
            example[i]=new ConstructorExample("abc");
        }

    }

}
