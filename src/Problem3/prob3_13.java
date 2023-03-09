package Problem3;

public class prob3_13 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 3) + 1;

        System.out.println("数値：" + randNum);

        switch (randNum) {
            case 1:
                System.out.println("グー");
                break;
            case 2:
                System.out.println("チョキ");
                break;
            case 3:
                System.out.println("パー");
                break;
        }
    }
}
