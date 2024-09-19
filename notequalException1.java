import java.util.Scanner;
class notequalException extends Exception {
  notequalException(String msg){
    super(msg);
  }
    
}
 public class notequalException1 {
    public static void main(String[] args) {
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter Independece year");
        try{
        int f=obj1.nextInt();
        if(f==1947){
            System.out.println("Right Answer");
        }
        else
        throw new notequalException("Wrong Answer");
    }catch(notequalException e){
        System.out.println("Wrong Answer");
    }

    }
}
