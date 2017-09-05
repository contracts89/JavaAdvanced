package introductionToJava.problem8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by contracts on 5/16/2017.
 */
public class GetAverage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float firstNum = Float.parseFloat(br.readLine());
        float secondNum = Float.parseFloat(br.readLine());
        float thirdNum = Float.parseFloat(br.readLine());

        float average = findAverage(firstNum, secondNum, thirdNum);
        System.out.println(String.format("%.2f", average));
    }

    private static float findAverage(float firstNum, float secondNum, float thirdNum) {
        float sum = firstNum + secondNum + thirdNum;
        return sum / 3;
    }
}
