
import java.io.File;
import java.io.FileWriter;

public class filewrite {
    public static void main(String[] args) {
        File fp=new File("sameer.txt");
        try{
        fp.createNewFile();
        }catch(Exception e){
            System.out.println("Unable to create new file:");
            e.printStackTrace();
        }
        try{
        FileWriter fw=new FileWriter("sameer.txt");
        fw.write("This is the first programe of java file write");
        fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
