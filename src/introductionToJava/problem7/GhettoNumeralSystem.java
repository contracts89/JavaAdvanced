package introductionToJava.problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by contracts on 5/16/2017.
 */
public class GhettoNumeralSystem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sbr = new StringBuilder();
        String input = br.readLine();
        int num = 0;

        for (int i = 0; i < input.length(); i++) {
            num = Integer.parseInt(String.valueOf(input.charAt(i)));
            switch (num){
                case 0:
                    sbr.append(Alphabet.Gee.name());
                    break;
                case 1:
                    sbr.append(Alphabet.Bro);
                    break;
                case 2:
                    sbr.append(Alphabet.Zuz);
                    break;
                case 3:
                    sbr.append(Alphabet.Ma);
                    break;
                case 4:
                    sbr.append(Alphabet.Duh);
                    break;
                case 5:
                    sbr.append(Alphabet.Yo);
                    break;
                case 6:
                    sbr.append(Alphabet.Dis);
                    break;
                case 7:
                    sbr.append(Alphabet.Hood);
                    break;
                case 8:
                    sbr.append(Alphabet.Jam);
                    break;
                case 9:
                    sbr.append(Alphabet.Mack);
                    break;
            }

        }
        System.out.println(sbr);

    }
}
