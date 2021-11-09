import java.text.NumberFormat;
import java.util.Locale;

public class JavaCurrencyFormatter {
    public static void main(String[] args) {
        double number = 12324.134d;
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRENCH);
        System.out.println(france.format(number));
        Locale INDIA = new Locale("English","India");
        NumberFormat india = NumberFormat.getCurrencyInstance(INDIA);
        System.out.println(india.format(number));

        String A= "hello";
        String B= "java";
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) < 0) {
            System.out.println("No");
        }
        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));
        
    }
}
