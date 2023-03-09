package Problem3;

public class prob3_1 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10) + 1;

        if (randNum >= 5) {
            System.out.println(randNum);
            System.out.println(randNum + "以上です");
        } else {
            System.out.println(randNum);
            System.out.println(randNum + "未満です");
        }
    }
}
