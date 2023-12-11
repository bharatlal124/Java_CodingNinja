import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int P = sc.nextInt();
        double R = sc.nextDouble();
        int T = sc.nextInt();

        int SI = (int) (P * R * T); // change double into int

        System.out.println(SI);
    }
}