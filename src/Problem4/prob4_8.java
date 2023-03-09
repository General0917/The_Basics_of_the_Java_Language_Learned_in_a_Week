package Problem4;

public class prob4_8 {
    public static void main(String[] args) {
        while (true) {
            int randNum = (int)(Math.random() * 10) + 1;
            System.out.println(randNum);

            if (randNum == 10) {
                System.out.println("終了します");
                break;
            }
        }
    }
}
