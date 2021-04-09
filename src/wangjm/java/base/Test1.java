package wangjm.java.base;

public class Test1 {
    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1==str2);//false
        System.out.println(str1.equals(str2));//true

        //Integer a = new Integer(1);
        //Integer b = new Integer(1);
        //
        //System.out.println(a==b);//false



        //int a = 1;
        //int b = 2;
        //Student s1 = new Student();
        //Student s2 = s1;
        //Student s3 = new Student();
    }
}

class Student{}
