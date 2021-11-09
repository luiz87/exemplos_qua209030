import java.time.LocalDate;
import java.util.Calendar;
import java.math.BigInteger;
import java.security.*;

public class JavaDateAndTime {
    public static void main(String[] args) {
        String txt = "HelloWorld";
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(txt.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String hashtext = bigInt.toString(16);
            System.out.println(hashtext);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
