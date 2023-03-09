package Problem4;

public class prob4_13 {
    public static void main(String[] args) {
        int limitNum = 5;
        int randNum = (int)(Math.random() * 10) + 1;

        if (randNum >= limitNum) {
            for (int i = 0; i < randNum; i++) {
                System.out.print("★ ");
            }
        } else if (randNum < limitNum) {
            System.out.println("発生した数値：" + randNum);
        }
    }
}
