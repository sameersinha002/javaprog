class outerclass2 {
    void print(){
        System.out.println("Outer Class");
    }

    class Inner{
        void print(){
            System.out.println("Inner class");
        }
    }
}
public class outerinner{
public static void main(String[] args){
    outerclass2 obj1=new outerclass2();
    obj1.print();
    outerclass2.Inner obj2= obj1.new Inner();
    obj2.print();
}
}
