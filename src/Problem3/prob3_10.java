package Problem3;

public class prob3_10 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        System.out.println("数値：" + randNum);

        if (randNum <= 10 || randNum >= 90) {
            System.out.println("10以下か90以上の値です");
        } else {
            System.out.println("10より大きく90未満です");
        }
    }
}
