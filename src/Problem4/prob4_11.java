package Problem4;

public class prob4_11 {
    public static void main(String[] args) {
        int maxNum = 0;

        for (int i = 0; i < 5; i++) {
            int randNum = (int)(Math.random() * 100) + 1;

            System.out.println(randNum);

            if (randNum > maxNum) {
                maxNum = randNum;
            }
        }
        System.out.println("最大値：" + maxNum);
    }
}
