package Problem3;

public class prob3_7 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 6) + 1;

        System.out.println("数値：" + randNum);

        if (randNum >= 5) {
            System.out.println("5以上です");
        } else if (randNum < 5) {
            System.out.println("5未満です");
        }
    }
}
