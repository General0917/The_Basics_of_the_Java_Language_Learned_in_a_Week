package Problem3;

public class prob3_3 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        if (randNum < 50) {
            System.out.println(randNum);
            System.out.println("50未満です");
        } else {
            System.out.println(randNum);
            System.out.println("50以上です");
        }
    }
}
