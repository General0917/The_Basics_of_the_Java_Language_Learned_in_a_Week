package Problem3;

public class prob3_14 {
    public static void main(String[] args) {
        int randNumA = (int)(Math.random() * 10) + 1;
        int randNumB = (int)(Math.random() * 10) + 1;

        System.out.println("aの数値：" + randNumA);
        System.out.println("bの数値：" + randNumB);

        if (randNumA > randNumB) {
            System.out.println( "aの方が大きいです。");
        } else if(randNumA < randNumB) {
            System.out.println("bの方が大きいです");
        } else if (randNumA == randNumB) {
            System.out.println("どちらも等しいです");
        }
    }
}
