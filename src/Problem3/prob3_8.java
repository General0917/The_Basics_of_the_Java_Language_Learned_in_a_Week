package Problem3;

public class prob3_8 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10) + 1;

        System.out.println("数値：" + randNum);
        if (randNum != 1) {
            System.out.println("1ではありません");
        } else if(randNum == 1) {
            System.out.println("1です");
        }
    }
}
