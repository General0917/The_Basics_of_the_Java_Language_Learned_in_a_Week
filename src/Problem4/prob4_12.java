package Problem4;

public class prob4_12 {
    public static void main(String[] args) {
        int minNum = 100;

        for (int i = 0; i < 5; i++) {
            int randNum = (int)(Math.random() * 100) + 1;
            System.out.println(randNum);

            if (minNum > randNum) {
                minNum = randNum;
            }
        }

        System.out.println("最小値：" + minNum);
    }
}
