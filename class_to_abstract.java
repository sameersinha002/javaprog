class asssn1{
    void print11(){
        System.out.println("normal class");
    }
}
abstract class child111 extends asssn1{
    void print11(){
        System.out.println("abstarct class");
    }
}
public class class_to_abstract {
    public static void main(String[] args) {
        child111 obj1= new child111(){};
        asssn1 obj2= new asssn1();
        obj2.print11();
        obj1.print11(); 
    }
  
     
}