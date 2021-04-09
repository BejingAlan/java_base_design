package wangjm.java.base.thread;

public class MyTest1 {
    public static void main(String[] args) throws InterruptedException {

        MyTread myTread1 = new MyTread("a");
        MyTread myTread2 = new MyTread("b");
        MyTread myTread3 = new MyTread("c");

        Thread t1 = new Thread(myTread1);
        Thread t2 = new Thread(myTread2);
        Thread t3 = new Thread(myTread3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}

class MyTread implements Runnable {

    private String threadName;

    public MyTread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + ":" + i);
        }
    }
}