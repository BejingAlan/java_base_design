package wangjm.java.base.thread;

public class MyTest {
    public static void main(String[] args) {

       B b = new B();
       b.test();

    }
}

class B extends A{

    //静态代码块
    static {
        System.out.println("执行B类静态代码块");
    }
    //代码块
    {
        System.out.println("执行B类代码块");
    }

    //无参构造函数
    public B(){
        System.out.println("执行B类无参构造函数");
    }

    //A类方法
    public void test(){
        System.out.println("执行B类方法");
    }
}





class A{

    //静态代码块
    static {
        System.out.println("执行A类静态代码块");
    }
    //代码块
    {
        System.out.println("执行A类代码块");
    }

    //无参构造函数
    public A(){
        System.out.println("执行A类无参构造函数");
    }

    //A类方法
    public void test(){
        System.out.println("执行A类方法");
    }
}
