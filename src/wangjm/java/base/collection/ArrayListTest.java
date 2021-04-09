package wangjm.java.base.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("Wang");
        arrList.add("Li");

        Iterator<String> it = arrList.listIterator();
        while (it.hasNext()){
            //System.out.println(((ListIterator<String>) it).previous());
            System.out.println(it.next());
        }
    }
}
