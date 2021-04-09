package wangjm.java.base.arrayresearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLearn {
    public static void main(String[] args) {

        //ArrayList
        //List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        //List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
        //ArrayList<String> stooges = (ArrayList<String>) Arrays.asList("Larry", "Moe", "Curly");//不能转换
        List<String> stooges = new ArrayList<>(Arrays.asList("Larry", "Moe", "Curly"));
        //测试返回类型
        System.out.println(Arrays.asList("Larry", "Moe", "Curly").getClass());//class java.util.Arrays$ArrayList

        print(stooges);
        System.out.println("====add方法前=====");
        stooges.add("wang");
        print(stooges);

        List<List<String>> seasonsList = Arrays.asList(retrieveSeasonsList());
        print(seasonsList);
        /*
         * 自己实现一个asList方法，能够添加和删除。
         */
        List<String> list = MyArrays.asList("Larry", "Moe", "Curly");
        list.add("Hello");
        print(list);

        // Array
        // get 和 set测试：
        //int[] array = {1, 2, 3, 4};
        //System.out.println(Array.getInt(array, 2));// 3
        //Array.setInt(array, 2, 33);
        //System.out.println(Array.getInt(array, 2));// 33
        //
        //// 用Array类创建数组
        //// 一维数组：
        //Object o = Array.newInstance(int.class, 4);
        //int[] array1 = (int[])o;
        //System.out.println(Arrays.toString(array1));// [0, 0, 0, 0]
        //// 二维数组：
        //Object o1 = Array.newInstance(int.class, 3, 4);
        //int[][] array2 = (int[][])o1;


        //System.out.println(mutilParamMethod("wangjm","Alan"));

        //字符串逆转
        ////字符串
        //String s="ABC";
        ////字符串数组
        //char[] c=s.toCharArray();
        //
        ////String拼接
        //StringBuffer sb=new StringBuffer();
        //
        ////取组合的长度
        //for(int i=1;i<=c.length;i++) {
        //    permutation(c,0,i,sb);
        //}
    }

    private static <T> void print(List<T> list) {
        System.out.println(list);
    }
    private static List<String> retrieveSeasonsList() {
        List<String> seasonsList = new ArrayList<String>();
        seasonsList.add("Spring");
        seasonsList.add("Summer");
        seasonsList.add("Autumn");
        seasonsList.add("Winter");
        return seasonsList;
    }


    //测试多参数传递
    public static String[] mutilParamMethod(String... name){
        System.out.println(name);
        return name;
    }

    // 字符串排列组合
    private static void permutation(char[] c,int p,int len, StringBuffer sb) {
        if(len==0) {//当都选择结束时打印sb内容
            System.out.println(sb+" ");
            return;
        }

        if(p==c.length) return;

        sb.append(c[p]);//取
        permutation(c,p+1,len-1,sb);// 剩下的里面选len-1个

        sb.deleteCharAt(sb.length()-1);//不取
        permutation(c,p+1,len,sb);//剩下的里面选len个
    }
}

class MyArrays {
    public static <T> List<T> asList(T... a) {
        List<T> list = new ArrayList<T>();
        Collections.addAll(list, a);
        return list;
    }
}
