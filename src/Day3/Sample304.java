package Day3;

public class Sample304 {
    public static void main(String[] args) {
        int dice = (int)(Math.random() * 7) + 1;

        System.out.println("さいころの目：" + dice);

        if (1 <= dice && dice <= 6) {
            if (dice == 2 || dice == 4 || dice == 6) {
                System.out.println("偶数です");
            } else {
                System.out.println("奇数です");
            }
        } else {
            System.out.println("想定外の値です");
        }
    }
}
