package wangjm.java.base;

public class ClasssExecuteSequence {
    public static void main(String[] args) {
//        A a = new A();
//        A a2 = new A();

//       new B("WANG");
        new C();
    }


}

class B{
    public B(){
        System.out.println("B无参构造函数");
    }

    public B(String name){
        System.out.println("B有参构造函数"+name);
    }
}

class C extends B{
    public C(){
        super("wang");
    }
}





class A{
    //静态代码
    static {
        System.out.println("执行：静态代码快");
    }
    //非静态代码快
    {
        System.out.println("执行：非静态代码块");
    }
    //静态字段
    private static int name = getName();
    //非静态字段
    private static int age = getAge();
    //构造方法
    public A(){
        System.out.println("执行：构造方法");
    }
    public static int getName(){
        System.out.println("执行：静态字段");
        return 10;
    }

    public static int getAge(){
        System.out.println("执行：非静态字段");
        return 20;
    }

}
