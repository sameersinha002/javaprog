abstract class shape{
 void area1(){
 };
 void perimeter1(){
 };
}
class rectangle11 extends shape{
      void area1(int l,int b){
         System.out.println("Area of rectangle is "+(l*b));
      }
      void perimeter1(int l, int b){
        System.out.println("Perimeter of rectangle is "+((2*l+2*b)));
      }
} 
class circle11 extends shape{
    void area1(int r){
        System.out.println("Area of cirle is "+(3.14*r*r));
     }
   
     void perimeter1(int r){
       System.out.println("Perimeter of circle is "+(2*3.14*r));
}
}
public class abstractarea {
    public static void main(String[] args) {
        rectangle11 obj1=new rectangle11();
        circle11 obj2= new circle11();
        obj1.area1(4,5);
        obj1.perimeter1(4,5);
        obj2.area1(9);
        obj2.perimeter1(9);
    }
}
