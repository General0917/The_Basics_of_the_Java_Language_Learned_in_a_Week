package Day5;

public class Sample501 {
    public static void main(String[] args) {
        double one, two, three;
        double sum, ave;

        one = 1.2;
        two = 3.7;
        three = 4.1;

        System.out.println(one + " " + two + " " + three);

        sum = one + two + three;
        ave = sum / 3.0;

        System.out.println("合計値：" + sum);
        System.out.println("平均値：" + ave);
    }
}
