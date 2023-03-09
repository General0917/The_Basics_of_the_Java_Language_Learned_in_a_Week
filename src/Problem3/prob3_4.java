package Problem3;

public class prob3_4 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        if (randNum <= 10 || randNum >= 90) {
            System.out.println(randNum);
            System.out.println("10以下か90以上の値です");
        } else {
            System.out.println(randNum);
            System.out.println("10以下か90以上の値ではないです");
        }
    }
}
