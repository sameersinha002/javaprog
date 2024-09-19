class threadexample extends Thread{
    public void run(){
      if(Thread.currentThread().isDaemon())
      System.out.println("Demon thread");
      else
      System.out.println("user thread");
    }

}
public class deamonthread{
    public static void main(String[] args) {
        threadexample t1= new threadexample();
        threadexample t2= new threadexample();
        threadexample t3= new threadexample();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
}