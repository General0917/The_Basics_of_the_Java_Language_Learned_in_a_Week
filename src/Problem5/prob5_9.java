package Problem5;

public class prob5_9 {
    public static void main(String[] args) {
        int data[] = new int[10];
        int newLine = 2;
        int numLimit = 50;

        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 100) + 1;

            System.out.print(data[i] + " ");
        }

        for (int i = 0; i < newLine; i++) {
            System.out.println();
        }

        System.out.print("50以上の数：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= numLimit) {
                System.out.print(data[i] + " ");
            }
        }

        System.out.println();

        System.out.print("50未満の数：");
        for (int i = 0; i < data.length; i++) {
            if (data[i] < numLimit) {
                System.out.print(data[i] + " ");
            }
        }
    }
}
