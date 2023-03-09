package Problem3;

public class prob3_9 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        System.out.println("数値：" + randNum);
        if (randNum < 50) {
            System.out.println("50未満です");
        } else if (randNum >= 50){
            System.out.println("50以上です");
        }
    }
}
