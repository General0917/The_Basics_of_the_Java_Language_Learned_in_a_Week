package Problem4;

public class prob4_9 {
    public static void main(String[] args) {
        while (true) {
            int randNum = (int)(Math.random() * 100) + 1;

            System.out.println(randNum);

            if (randNum % 10 == 0) {
                System.out.println("終了します");
                break;
            }
        }
    }
}
