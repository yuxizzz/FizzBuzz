public class Multiples {
    public static void main(String[] args) {
        int accnt = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;
            if (divisibleBy3||divisibleBy5) {
                accnt++;
            };
        }
        System.out.println(accnt);
    }
}
