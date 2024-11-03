public class Main {
    public static void main(String[] args) {
        double amountKWD = 86;
        double convertToUSD = amountKWD * 3.25;
        System.out.printf("%.0f KWD = %.1f USD\n", amountKWD, convertToUSD);

        double amountUSD = 279;
        double convertToKWD = amountUSD / 3.25;
        double amountEUR = 98;
        double convertFromEUR = amountEUR * 0.33;
        System.out.printf("%.2f USD = %.3f KWD\n", amountUSD, convertToKWD);
        System.out.printf("%.2f EUR = %.3f KWD\n", amountEUR, convertFromEUR);
    }
}