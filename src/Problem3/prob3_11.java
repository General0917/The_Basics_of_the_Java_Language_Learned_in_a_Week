package Problem3;

public class prob3_11 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        System.out.println("数値：" + randNum);

        if (randNum >= 20 && randNum < 80) {
            System.out.println("20以上80未満です");
        } else {
            System.out.println("20未満か、80以上です");
        }
    }
}
