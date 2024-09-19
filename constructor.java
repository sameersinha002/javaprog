class test{
    String name;
    int rollno;
    test(){
        name=" ";
        rollno=0;
    }
    // test(String name1,int rollno1){
    //     name=name1;
    //     rollno=rollno1;+
    
    // }
    // OR
    test(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    void display(){
        System.out.println("Name= "+name+" Roll no= "+rollno);
    }
}
public class constructor {
    public static void main(String[] args) {
        test t1= new test();
        test t2= new test("sameer sinha",42);
        t1.display();
        t2.display();
    }
}
