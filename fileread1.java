
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

public class fileread1 {
    public static void main(String[] args) {
        File f1=new File("sameer.txt");
        try {
            FileOutputStream fp=new FileOutputStream(f1);
         Scanner sc=new Scanner(f1);
         char[] sp=sc.nextLine().toCharArray();
        for(char a:sp)
         fp.write(a);
        sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
