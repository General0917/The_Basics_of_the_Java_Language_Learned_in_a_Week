package Problem3;

public class prob3_17 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        System.out.println("数値：" + randNum);

        if (randNum <= 50 && randNum % 2 == 0) {
            System.out.println("50以下の偶数です");
        } else if (randNum <= 50) {
            System.out.println("50以下です");
        } else if (randNum % 2 == 0) {
            System.out.println("偶数です");
        }
    }
}
