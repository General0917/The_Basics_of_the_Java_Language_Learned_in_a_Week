package Problem7;

public class prob7_2 {
    public static void main(String[] args) {
        TwoStrings s = new TwoStrings();

        s.setStr1("Hello");
        s.setStr2("World");

        System.out.println("一つ目の文字列は" + s.getStr1());
        System.out.println("二つ目の文字列は" + s.getStr2());
        System.out.println("二つの文字列を合成したものは" + s.getConnectedString());
    }
}
