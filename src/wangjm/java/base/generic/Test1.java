package wangjm.java.base.generic;


public class Test1 {
    public static void main(String[] args) {


        Person<String> person = new Person<>();
        //person.part = "dd";
        //person.part = 10; //类型不匹配
    }
}



//泛型作用在类上
class Person<T>{
    String name;
    int age;
    T part;
}
