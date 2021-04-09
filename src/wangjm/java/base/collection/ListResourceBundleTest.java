package wangjm.java.base.collection;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

// ? 待研究
public class ListResourceBundleTest extends ListResourceBundle{
    private final Object[][] message_en_US = {{"hello", "Hello"}};
    private final Object[][] message_zh_CN = {{"hello", "你好"}};
    Object[][] data = null;

    protected Object[][] getContents() {
        if ("CN".equals(Locale.getDefault().getCountry())
                && "zh".equals(Locale.getDefault().getLanguage())) {
            data = message_zh_CN;
        }
        if ("US".equals(Locale.getDefault().getCountry())
                && "en".equals(Locale.getDefault().getLanguage())) {
            data = message_en_US;
        }
        return data;
    }

    public static void main(String[] args) {

        ResourceBundle rb = ResourceBundle.getBundle("wangjm.java.base.collection.ListResourceBundleTest",
                Locale.getDefault());
        String str = rb.getString("hello");
        System.out.println(str);
    }
}

//class Message extends ListResourceBundle {
//    private final Object[][] message_en_US = {{"hello", "Hello"}};
//    private final Object[][] message_zh_CN = {{"hello", "你好"}};
//    Object[][] data = null;
//
//    protected Object[][] getContents() {
//        if ("CN".equals(java.util.Locale.getDefault().getCountry())
//                && "zh".equals(java.util.Locale.getDefault().getLanguage())) {
//            data = message_zh_CN;
//        }
//        if ("US".equals(java.util.Locale.getDefault().getCountry())
//                && "en".equals(java.util.Locale.getDefault().getLanguage())) {
//            data = message_en_US;
//        }
//        return data;
//    }
//
//    public static void main(String[] args) {
//
//        ResourceBundle rb = ResourceBundle.getBundle("Message",
//                Locale.getDefault());
//        String str = rb.getString("hello");
//        System.out.println(str);
//    }
//}
