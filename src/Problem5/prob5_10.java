package Problem5;

public class prob5_10 {
    public static void main(String[] args) {
        int data[] = new int[7];
        int newLine = 2;

        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 10) + 1;
            System.out.print(data[i] + " ");
        }

        for (int i = 0; i < newLine; i++) {
            System.out.println();
        }

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
