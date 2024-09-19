public class generic_fun{
     <T> void display (T data){
        System.out.println(data.getClass().getName()+"="+data);
     }
    public static void main(String[] args) {
        generic_fun gf=new generic_fun();
        gf.display(15);
        gf.display("Hello Java");
        gf.display(45.5);
    }
}
