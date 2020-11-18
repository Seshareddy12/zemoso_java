package Problem7;
abstract class Rodent{
    abstract public void speak();
    abstract public void walk();
    abstract public void eat();

}
class Gerbil extends Rodent{
    public void speak(){
        System.out.println("Gerbil is speaking");
    }
    public void walk(){
        System.out.println("Gerbil is walking");
    }
    public void eat(){
        System.out.println("Gerbil is eating");
    }

}
class Hamster extends Rodent{
    public void speak(){
        System.out.println("Hamster is speaking");
    }
    public void walk(){
        System.out.println("Hamster is walking");
    }
    public void eat(){
        System.out.println("Hamster is eating");
    }

}
class Mouse extends Rodent{
        public void speak(){
        System.out.println("Mouse is speaking");
        }
        public void walk(){
        System.out.println("Mouse is walking");
        }
        public void eat(){
        System.out.println("Mouse is eating");
        }

}

public class Rats {
    public static void main(String args[]){
        Rodent rodent[] = {
                new Gerbil(),new Hamster(),new Mouse()
            };
        for(int i=0;i< rodent.length;i++)
        {
            rodent[i].speak();
            rodent[i].walk();
            rodent[i].eat();
        }
    }
}
