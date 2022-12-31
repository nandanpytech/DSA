import java.util.Arrays;

public class prac {
    public static void main(String[] args) {
        int target=2;
        target = Math.abs(target);
        int step = 0;
        int sum = 0;
        while (sum < target) {
            step++;
            sum += step;
        }
        while ((sum - target) % 2 != 0) {
            step++;
            sum += step;
        }
        System.out.println(step);

    }



}
