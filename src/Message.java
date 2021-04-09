import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Message extends ListResourceBundle {
    private final Object[][] message_en_US = { { "hello", "Hello" } };
    private final Object[][] message_zh_CN = { { "hello", "你好" } };
    Object[][] data = null;

    protected Object[][] getContents() {
        if ("CN".equals(java.util.Locale.getDefault().getCountry())
                && "zh".equals(java.util.Locale.getDefault().getLanguage())) {
            data = message_zh_CN;
        }
        if ("US".equals(java.util.Locale.getDefault().getCountry())
                && "en".equals(java.util.Locale.getDefault().getLanguage())) {
            data = message_en_US;
        }
        return data;
    }

    public static void main(String args[]) {
        ResourceBundle rb = ResourceBundle.getBundle("Message",
                java.util.Locale.getDefault());
        String str = rb.getString("hello");
        System.out.println(str);
    }
}
