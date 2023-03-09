package Problem1_application;

public class prob_app1_3 {
    public static void main(String[] args) {
        int height = (int)(Math.random() * 10) + 1;
        int width = (int)(Math.random() * 10) + 1;

        System.out.println("たて：" + height);
        System.out.println("よこ：" + width);

        System.out.println();

        square(height, width);
    }

    static void square (int height, int weight) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < weight; j++) {
                if (height == 0 || weight == 0) {
                    break;
                } else {
                    System.out.print("■" + " ");
                }
            }
            System.out.println();
        }
    }
}
