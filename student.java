import java.util.*;
public class student {
    public static void main(String[] args) {
        studentclass s1= new studentclass();
        s1.setName("Sameer Kumar Sinha.");
        s1.setAge(26);
        s1.getname();
        s1.getID();
        java.lang.System.out.println("null");
        Scanner sc= new Scanner(System.in);
    }
}
class studentclass {
    int roll_no;
    int age;
    String name;
    void getname(){
    System.out.println("Student name is "+name);
    }
    void getID(){
     System.out.println("Roll no is "+roll_no);
    }
    void setName(String sname){
     name=sname;
    }
    void setAge(int sage){
      age=sage;
    }

}