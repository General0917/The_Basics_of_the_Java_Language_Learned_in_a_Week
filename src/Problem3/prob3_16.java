package Problem3;

public class prob3_16 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;


        System.out.println("数値：" + randNum);

        if (randNum % 2 == 0 && randNum % 3 == 0) {
            System.out.println("2と3の公倍数です");
        } else if (randNum % 2 == 0) {
            System.out.println("2の倍数です");
        } else if (randNum % 3 == 0) {
            System.out.println("3の倍数です");
        }
    }
}
