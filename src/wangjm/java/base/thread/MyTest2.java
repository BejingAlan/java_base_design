package wangjm.java.base.thread;

public class MyTest2 {
    public static void main(String[] args) throws InterruptedException {

        MyClass myClass1 = new MyClass("a");
        MyClass myClass2 = new MyClass("b");
        MyClass myClass3 = new MyClass("c");

        Thread t1 = new Thread(myClass1);
        Thread t2 = new Thread(myClass2);
        Thread t3 = new Thread(myClass3);

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();
    }
}


class MyClass1 extends Thread{

    @Override
    public void run() {
        super.run();
    }
}


class MyClass implements Runnable{

    private String threadName;

    public MyClass(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(threadName+":"+i);
        }
    }
}
