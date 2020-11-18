package Problem7;




class Outer1 {

    static class Inner1{
        int data;
        Inner1(int data){
            this.data = data;
        }


    }
}
class Outer2 {
    static class Inner2 extends Outer1.Inner1{
        int data;
        public Inner2(int data) {
            super(data);
        }
    }
}

public class InnerImpl{
    public static void main(String args[]){
       Outer1 outer = new Outer1();
        Outer1.Inner1 inner = new Outer2.Inner2(4);


    }
}
