package Problem4;

public class prob4_1 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10) + 1;

        System.out.println("数：" + randNum);

        for (int i = 1; i <= randNum; i++) {
            System.out.print("■ ");
        }
    }
}
