package Problem3;

public class prob3_15 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 100) + 1;

        System.out.println("点数：" + randNum);

        if (randNum >= 80) {
            System.out.println("優");
        } else if (randNum < 80 && randNum >= 70) {
            System.out.println("良");
        } else if (randNum < 70 && randNum >= 60) {
            System.out.println("可");
        } else if (randNum < 60) {
            System.out.println("不可");
        }
    }
}
