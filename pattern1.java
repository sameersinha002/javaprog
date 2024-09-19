import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the number of lines");
      int x= sc.nextInt();
      for(int i=1;i<=x;i++){
        for(int j=15;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
      }
    }
}
