package wangjm.java.base.arrayresearch;

public class MyTest {
    public static void main(String[] args) {



        //Enumeration<String> name;
        //
        //List<String> list = new ArrayList<>();
        //list.add("wang");
        //list.add("zhang");
        //list.add("li");
        //
        //while (name.hasMoreElements()){
        //    System.out.println(name.nextElement());
        //}


        //Enumeration<String> days;
        //Vector<String> dayNames = new Vector<String>();
        //dayNames.add("Sunday");
        //dayNames.add("Monday");
        //dayNames.add("Tuesday");
        //dayNames.add("Wednesday");
        //dayNames.add("Thursday");
        //dayNames.add("Friday");
        //dayNames.add("Saturday");
        //days = dayNames.elements();
        //while (days.hasMoreElements()){
        //    System.out.println(days.nextElement());
        //}
    }
}

//定义接口
interface Language{
    String english();
    String chinese();

    String addLanguage(String language);
}

//定义抽象接口
abstract class AbstractLanguage implements Language{
    public String english() {
        return "speak english";
    }

    public String chinese() {
        return "speak chinese";
    }

    public String addLanguage(String language){
        //System.out.println("未实现该方法");
        //return "未实现该方法";
        throw new UnsupportedOperationException();
    }
}

class ChinesePeople extends AbstractLanguage{
    //public String addLanguage(String language){
    //    System.out.println("已实现该方法");
    //    return "已实现该方法";
    //}
}