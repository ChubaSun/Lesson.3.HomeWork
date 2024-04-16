import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] number = {5.5, 7.3, -4.8, 9.1, -2.5, -1.9, 2.2, 8.8};
        double sum = 0;
        int count = 0;
        boolean negativ = false;
        for (double i : number) {
            if (negativ && i > 0){
                sum+=i;
                count++;
            }
            if (i < 0 ){
                negativ = true;

            }
        }
        System.out.println(sum/count);
    }
}