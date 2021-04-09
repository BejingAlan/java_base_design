package wangjm.java.base.stringresearch;

public class StringLearn {
    public static void main(String[] args) throws InterruptedException {

        String str = "ABDCEFG";
        System.out.println(reverseString(str.toCharArray()));
    }


    //双指针 letcode
    public static char[] reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        while (left < right)
        {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }



    //字符串逆转
    public static String strReverse(String str){
        StringBuffer buffer = new StringBuffer();
        //将字符串转换为字符串数组
        char[] resultChar = str.toCharArray();

        for (int i = resultChar.length; i >0; i--) {
            buffer.append(resultChar[i-1]);
        }
        return buffer.toString();
    }
}
