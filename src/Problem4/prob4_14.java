package Problem4;

public class prob4_14 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10) + 1;

        if (randNum % 2 == 0) {
            for (int i = 0; i < randNum; i++) {
                System.out.print("★ ");
            }
        } else if (randNum % 2 == 1) {
            for (int i = 0; i < randNum; i++) {
                System.out.print("☆ ");
            }
        }
    }
}
