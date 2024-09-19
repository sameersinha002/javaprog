
class shared1 {

    int item;
    boolean available = false;

    synchronized public void getitem() {
        if (available == false) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("consumer" + item);
        available = false;
        notify();
    }

    synchronized public void setitem(int i) {
        if (available == true) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.item = i;
        System.out.println("producer" + item);
        available = true;
        notify();
    }
}

class producer1 extends Thread {

    shared1 s1;

    producer1(shared1 s1) {
        this.s1 = s1;
        this.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s1.setitem(i);
        }
    }
}

class consumer1 extends Thread {

    shared1 s1;

    consumer1(shared1 s1) {
        this.s1 = s1;
        this.start();
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            s1.getitem();
        }
    }
}

public class interthread {

    public static void main(String[] args) {
        shared1 s = new shared1();
        Thread c = new consumer1(s);
        Thread p = new producer1(s);
    }
}
