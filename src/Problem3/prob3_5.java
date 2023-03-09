package Problem3;

public class prob3_5 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        if (randNum >= 20 && randNum < 80) {
            System.out.println(randNum);
            System.out.println("20以上80未満です");
        } else {
            System.out.println(randNum);
            System.out.println("20以上80未満ではないです。");
        }
    }
}
