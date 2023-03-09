package Problem5;

public class prob5_8 {
    public static void main(String[] args) {
        int data[] = new int[5];
        int newLine = 2;
        int zero = 0;
        int zero_greater = 0;
        int zero_less = 0;
        int zero_count = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = (int)(Math.random() * 21) - 10;
            System.out.print(data[i] + " ");
        }

        for (int i = 0; i < newLine; i++) {
            System.out.println();
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i] > zero) {
                zero_greater++;
            } else if (data[i] < zero) {
                zero_less++;
            } else if (data[i] == zero) {
                zero_count++;
            }
        }

        System.out.println("0より大きい数：" + zero_greater);
        System.out.println("0より小さい数：" + zero_less);
        System.out.println("0の個数：" + zero_count);
    }
}
