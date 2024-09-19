
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    public class executerthread extends Thread{
        static int x=0;
        public void run(){
            System.out.println(Thread.currentThread().getName()+" "+x++);
        }
    }
class executor{
    public static void main(String[] args) {
        // ExecutorService service= Executors.newSingleThreadExecutor();
        ExecutorService servicepool=Executors.newFixedThreadPool(100);
        for(int i=1;i<100000;i++){
            servicepool.execute(new executerthread());
        }
    }

}
