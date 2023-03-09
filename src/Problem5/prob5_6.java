package Problem5;

public class prob5_6 {
    public static void main(String[] args) {
        int data[] = new int[10];
        int newLine = 2;
        int maxNum = 0;
        int minNum = 10;
        double avg = 0.0;

        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 10) + 1;
            System.out.print(data[i] + " ");

            if (data[i] > maxNum) {
                maxNum = data[i];
            }
            if (data[i] < minNum) {
                minNum = data[i];
            }

            avg += data[i];
        }

        for (int i = 0; i < newLine; i++) {
            System.out.println();
        }

        avg /= data.length;
        System.out.println("最大値：" + maxNum);
        System.out.println("最小値；" + minNum);
        System.out.println("平均値：" + avg);
    }
}
