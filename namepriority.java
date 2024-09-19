class testthread extends Thread{
    public void run(){
        System.out.println("R");
    }
}
public class namepriority{
    public static void main(String[] args) {
        testthread a= new testthread();
        System.out.println("Thread: "+a.getName());
        System.out.println("priority: "+a.getPriority());
        a.setName("java thread");
        a.setPriority(10);
        System.out.println("Thread: "+a.getName());
        System.out.println("priority: "+a.getPriority());
    }
}