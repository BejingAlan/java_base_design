package wangjm.java.base.generic;

public class Test {
    public static void main(String[] args) {

        Tool tool = new Tool();
        tool.setObj(new Student());
        Teacher teacher = (Teacher) tool.getObj();//编译能通过，但程序执行时不通过
    }
}

//泛型安全性
class Tool{
    private Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}

class Teacher{}

class Student{}