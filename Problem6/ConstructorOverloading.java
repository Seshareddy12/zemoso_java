package Problem6;

public class ConstructorOverloading {
    int data1,data2;
    ConstructorOverloading(){
        System.out.println("In constructor 1");
    }
    ConstructorOverloading(int data1,int data2){
        this();
        this.data1=data1;
        this.data2=data2;
    }
    public static void main (String args[])
    {
        ConstructorOverloading objec1 = new ConstructorOverloading();
        ConstructorOverloading object2 = new ConstructorOverloading(2,3);
    }
}
