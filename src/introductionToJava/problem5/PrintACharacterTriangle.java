package introductionToJava.problem5;

import org.omg.CORBA.Environment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by contracts on 5/15/2017.
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sbr = new StringBuilder();
        char a = 'a';

        for (int i = 0; i < num - 1; i++) {
           char b = 'a';
            sbr.append(a + "\n\r");

            for (int j = 0; j < i + 1; j++) {
                sbr.append(b);
                b++;
                //sbr.append(b);
            }
        }

        sbr.append(a);
        sbr.append("\n\r");

        for (int i = num - 2; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                sbr.append(a);
            }

            sbr.append(a + "\n\r");
        }

        sbr.append(a);
        System.out.println(sbr);
    }
}
