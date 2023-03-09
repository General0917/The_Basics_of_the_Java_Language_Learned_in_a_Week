package Problem8;

public class prob8_1 {
    public static void main(String[] args) {
        for (int c = 1; c <= 100; c++) {
            for (int b = 1; b < c; b++) {
                for (int a = 1; a < b; a++) {
                    if (a * a + b * b == c * c) {
                        System.out.println("a = " + a + ", " + "b = " + b + ", " + "c = " + c);
                    }
                }
            }
        }
    }
}
