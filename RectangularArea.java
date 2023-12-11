import java.util.Scanner;

public class RectangularArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int Length = (x2 - x1);
        int Breath = (y2 - y1);

        int area = Length * Breath;

        System.out.println(area);

    }
}
