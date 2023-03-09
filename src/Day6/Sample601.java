package Day6;

public class Sample601 {
    public static void main(String[] args) {
        SampleClass01 SC01 = new SampleClass01();

        SC01.n = 100;
        SC01.s = "Hello";

        int ans = SC01.add(1, 2);
        String str = SC01.add("World");
        System.out.println(ans);
        System.out.println(str);
        SC01.showNum();
    }
}
