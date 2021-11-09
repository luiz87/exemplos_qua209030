import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String txt = "";
        List<String> lines = new ArrayList<String>();
        do {
            txt = input.nextLine();
            lines.add(txt);
        } while (!txt.equals(""));
        input.close();
        int i = 1;
        for (String string : lines) {
            if(!string.equals(""))
            System.out.println(i++ +" "+ string);
        }
    }
}
