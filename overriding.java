class animal {
public void animalSound(){
    System.out.println("The animal makes sound");
}
}
class cow extends animal{
    public void animalSound(){
        System.out.println("the cow says mah mah");
    }
}
class Dog extends animal{
    public void animalSound(){
        System.out.println("the dog says: bow bow");
    }
}

public class overriding{
    public static void main(String[] args) {
        animal obj1=new animal();
        animal obj2= new cow();
        animal obj3= new Dog();
        obj1.animalSound();
        obj2.animalSound();
        obj3.animalSound();
    }
}
