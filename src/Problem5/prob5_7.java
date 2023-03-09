package Problem5;

public class prob5_7 {
    public static void main(String[] args) {
        int data[] = new int[5];
        int newLine = 2;
        int sumNum = 0;
        double avgNum;

        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 10) + 1;
            System.out.print(data[i] + " ");

            sumNum += data[i];
        }

        for (int i = 0; i < newLine; i++) {
            System.out.println();
        }

        avgNum = sumNum / data.length;
        System.out.println("合計値：" + sumNum);
        System.out.println("平均値：" + avgNum);

        System.out.println();

        System.out.print("平均値より大きい数：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] > avgNum) {
                System.out.print(data[i] + " ");
            }
        }

        System.out.println();

        System.out.print("平均値より小さい数：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] < avgNum) {
                System.out.print(data[i] + " ");
            }
        }
    }
}
