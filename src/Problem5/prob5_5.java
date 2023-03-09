package Problem5;

public class prob5_5 {
    public static void main(String[] args) {
        int data[] = new int[10];
        int newLine = 2;
        int multipleNum = 3;

        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 10) + 1;
            System.out.print(data[i] + " ");
        }

        for (int i = 0; i < newLine; i++) {
            System.out.println();
        }

        System.out.print("3の倍数：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] % multipleNum == 0) {
                System.out.print(data[i] + " ");
            }
        }

        System.out.println();

        System.out.print("3の倍数以外：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] % multipleNum != 0) {
                System.out.print(data[i] + " ");
            }
        }
    }
}
