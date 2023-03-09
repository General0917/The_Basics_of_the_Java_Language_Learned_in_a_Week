package Problem3;

public class prob3_2 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 10) + 1;

        if (randNum != 1) {
            System.out.println(randNum);
            System.out.println("1ではありません");
        } else {
            System.out.println(randNum);
            System.out.println("値は" + randNum + "です");
        }
    }
}
