package introductionToJava.porblem6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by contracts on 5/16/2017.
 */
public class SumNumbersFrom1ToN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int initialNum = 1;
        int result = 0;

        for (int i = 1; i <= num; i++) {
            result += i;
        }

        System.out.println(result);
    }
}
