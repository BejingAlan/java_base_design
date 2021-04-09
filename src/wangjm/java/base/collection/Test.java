package wangjm.java.base.collection;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        //集合基本操作
        ///**
        // * 1.集合元素排序
        // * 2.集合元素倒序
        // * 3.集合元素打乱
        // * 4.集合元素二分法查找
        // * 5.集合元素的迭代：for,for增强，Iterator
        // *
        // */
        Integer[] arr = {10,8,9,4,5,6,1,3,2,7};

        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(1);
        list.add(3);
        list.add(2);

        List<Integer> list1 = new ArrayList<Integer>();
        list1.addAll(list);

        //Collections


        //二分法查找
        //int result = Collections.binarySearch(list,4);
        //System.out.println(result);

        //为list排序
        //Collections.sort(list);//1,2,3,4
        //倒叙
        //Collections.reverse(list);

        //Iterator<Integer> iterator = list.iterator();
        //while (iterator.hasNext()){
        //    System.out.println(iterator.next());
        //}


        //list长度
        //System.out.println(list.size());
        //迭代
        //for (Integer a : list){
        //    System.out.println(a);
        //}

        //Iterator<Integer> it = list.iterator();
        //while (it.hasNext()){
        //    System.out.println(it.next());
        //}


        //输入字符串
        //Scanner in = new Scanner(System.in);
        //String s = in.nextLine();
        //System.out.println(s);


        //List<String> lst = new ArrayList<String>();
        //lst.add("aaa");
        //lst.add("bbb");
        //lst.add("ccc");
        //lst.add("ddd");
        //lst.add("eee");
        //lst.add("fff");
        //Iterator<String> iterator = lst.iterator();
        //iterator.hasNext()如果存在元素的话返回true
        //while (iterator.hasNext()) {
        //    //iterator.next()返回迭代的下一个元素
        //    System.out.println(iterator.next());
        //}
    }
}


