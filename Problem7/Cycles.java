package Problem7;
class Cycle{

}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("Bicycle Balancing");
    }
}
class Tricycle extends Cycle{

}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("Unicycle Balancing");
    }
}

public class Cycles {
    public static void main(String args[]){
        Cycle cycles[] = { new Bicycle(), new Tricycle(), new Unicycle() };
        for(int i=0;i<cycles.length;i++){
            //cycles[i].balance();
        }
        Bicycle b = (Bicycle)cycles[0];
        b.balance();
        Tricycle t = (Tricycle)cycles[1];
        //t.balance();


    }
}
