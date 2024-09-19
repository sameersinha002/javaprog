
public class Innerexception_handdeling {
    static void check() throws ArithmeticException {
        int b = 10, a = 0;
        // // try {
            int c = b / a;
            System.out.println("Quotient:" + c);
        // // } catch (ArithmeticException ae) {
        // //     System.out.println("Caught Exception" + ae);
        //     // ae.printStackTrace();
        // // }

    }

    public static void main(String[] args) {
        try{
        check();
        }catch(ArithmeticException ae){
            System.out.println("Exception here"+ae);
            ae.printStackTrace();
         }
    }

}
