package Problem3;

public class prob3_12 {
    public static void main(String[] args) {
        int randNum = (int)(Math.random() * 21) - 10;

        System.out.println("数値：" + randNum);

        if (randNum < 0) {
            System.out.println("負の値です");
        } else if(randNum > 0) {
            System.out.println("正の値です");
        } else {
            System.out.println(randNum + "です");
        }
    }
}
