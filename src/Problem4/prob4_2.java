package Problem4;

public class prob4_2 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10) + 1;
        int i = 1;

        System.out.println("数：" + randNum);

        while (i <= randNum) {
            System.out.print("■ ");
            i++;
        }
    }
}
