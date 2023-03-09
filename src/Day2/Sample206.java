package Day2;

public class Sample206 {
    public static void main(String[] args) {
        // finalがついた変数の値は変えられない！！
        final int NUMBER = 100;
        final String STRING = "Hoge";

        System.out.println(NUMBER);
        System.out.println(STRING);
    }
}
