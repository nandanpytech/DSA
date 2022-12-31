import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if((float)Math.sqrt(num)==Math.ceil(Math.sqrt(num))){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
