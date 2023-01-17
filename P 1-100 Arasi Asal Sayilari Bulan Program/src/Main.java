public class Main {
    public static void main(String[] args) {
        int bolen = 0;
        for (int a = 1; a <= 100; a++) {
            for (int b = 1; b <= a; b++) {
                if (a % b == 0) {
                    bolen++;
                }
            }
            if (bolen == 2) {
                System.out.print(a + " ");
            }
            bolen = 0;
        }
    }
}