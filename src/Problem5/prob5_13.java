package Problem5;

public class prob5_13 {
    public static void main(String[] args) {
        int data[][] = new int[3][3];
        int newLine = 2;
        int maxNum = 0;
        int minNum = 10;

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j] = (int)(Math.random() * 10) + 1;
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < newLine; i++) {
            System.out.println();
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] > maxNum) {
                    maxNum = data[i][j];
                }
            }
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i][j] < minNum) {
                    minNum = data[i][j];
                }
            }
        }

        System.out.println("最大値：" + maxNum);
        System.out.println("最小値：" + minNum);
    }
}
