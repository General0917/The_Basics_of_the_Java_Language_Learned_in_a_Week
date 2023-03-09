package Problem3;

public class prob3_6 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 6) + 1;
        System.out.println("数値：" + randNum);

        if (randNum >= 3) {
            System.out.println("3以上です");
        }
    }
}
