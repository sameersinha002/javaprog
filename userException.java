import java.util.Scanner;

public class userException {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the Age:");
     int age;
     try {
     age=sc.nextInt();
       if(age>18){
        System.out.println("Valid voter");
       }
       else
        ageexception(age);
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

public static void ageexception(int age) throws Exception{
    throw new Exception("You are not valid voter");
}
}
