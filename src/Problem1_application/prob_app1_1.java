package Problem1_application;

public class prob_app1_1 {
    public static void main(String[] args) {
        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;
        int result_add = add(a, b);
        int result_sub = sub(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println(a + " + " + b + " = " + result_add);
        System.out.println(a + " - " + b + " = " + result_sub);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }
}
