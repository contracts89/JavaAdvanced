package introductionToJava.problem4;

/**
 * Created by contracts on 5/15/2017.
 */
public class PrintCharacters {
    public static void main(String[] args) {
        char c = 'a';

        for (int i = 0; i < 26; i++) {
            System.out.print(c);
            if(i == 25){
                break;
            }
            System.out.print(' ');
            c++;
        }
    }
}
