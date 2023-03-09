package Problem3;

public class prob3_18 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 46) - 10;

        System.out.println("摂氏：" + randNum + "度");

        if (randNum >= 30) {
            System.out.println("真夏日です");
        } else if (randNum >= 25 && randNum < 30) {
            System.out.println("夏日です");
        } else if (randNum < 0) {
            System.out.println("真冬日です");
        }
    }
}
