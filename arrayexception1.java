
public class arrayexception1 {
    static void check() throws ArrayIndexOutOfBoundsException {

        int a[] =new int[]{1,2,3,4,5};
        System.out.println("here"+a[5]);
    }

    public static void main(String[] args) {
        try{
        check();
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Exception here"+ae);
         }
    }
}