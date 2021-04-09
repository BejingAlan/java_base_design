package wangjm.java.base.collection;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        //集合去重
        hashSet.add("wang");
        hashSet.add("zhang");
        hashSet.add("wang");
        hashSet.add("Li");

        for (String str : hashSet){
            System.out.println(hashSet);
        }
    }
}
