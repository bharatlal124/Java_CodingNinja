public class PositiveNegative {

    public static String CheckPositiveNegative(int number) {
        if (number > 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

    public static void main(String[] args) {
        int val = -67;
        String reault = CheckPositiveNegative(val);
        System.out.println("The value is : " + reault);

    }
}
