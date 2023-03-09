package Problem4;

public class prob4_16 {
    public static void main(String[] args) {
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= 9; y++) {
                System.out.print(x + "*" + y + "=" + x * y + " ");
            }
            System.out.println();
        }
    }
}
