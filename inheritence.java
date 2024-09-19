class testA{
    int a;
    testA(int x){
     a=x;
    }
    void show(){
        System.out.println("a in parentclass = "+a);
    }
}
class testB extends testA{
    // int b;
    
  testB(int x) {
        super(x);
    }

void display(){
    System.out.println("in child class");
  }
}
public class inheritence {
    public static void main(String[] args) {
        testB obj2= new testB(5);
        obj2.show();
        obj2.display();

    }
}
