package Problem4;

public class prob4_17 {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if (x >= y) {
                    System.out.print("■ ");
                } else if (x != y) {
                    System.out.print("□ ");
                }
            }
            System.out.println();
        }
    }
}
