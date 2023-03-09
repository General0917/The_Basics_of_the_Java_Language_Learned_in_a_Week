package Problem6;

public class prob6_3 {
    public static void main(String[] args) {
        Circle c = new Circle();

        double r;
        // 円の半径
        c.r = 4.0;

        r = c.r;

        System.out.println("半径" + r + "の円の円周の長さは" + c.circumference());
        System.out.println("半径" + r + "の円の面積の長さは" + c.area());

    }
}
