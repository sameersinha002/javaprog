 import java.util.*;
 class student2{
 String name;
 int rollno;

 void setname(String name2){
    name=name2;
 }
 void getname(){
   System.out.println("Name = "+name);
 }
 void setroll(int roll){
rollno=roll;
 }
 void getroll(){
   System.out.println("Roll = "+rollno);
 }
}
public class getter_setter {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        student2 s1= new student2();
        String name1= sc.nextLine();
        int roll1= sc.nextInt();
       s1.setname(name1);
        s1.setroll(roll1);
        s1.getname();
        s1.getroll();
    }
}
