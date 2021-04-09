package wangjm.java.base.collection;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap();
        hashMap.put("wang",30);
        System.out.println(hashMap.put("zhang",30));
    }
}
