abstract class bird{
    abstract void eat();
    abstract void fly();
}
class eagle extends bird{
        void eat(){
            System.out.println("eagle eats snake");
        }
        void fly()
        {
            System.out.println("eagle fly high");
        }
}
class pigeon extends bird{
    void eat(){
        System.out.println("pigeon eats grains");
    }
    void fly()
    {
        System.out.println("pigeon fly low");
    }
}
public class abstractclass {
public static void main(String[] args) {
    pigeon obj1= new pigeon();
    eagle obj2= new eagle();
    bird obj3= new eagle();
    obj1.eat();
    obj1.fly();
    obj2.eat();
    obj2.fly();
    obj3.fly();
    obj3.eat();
}    
}
