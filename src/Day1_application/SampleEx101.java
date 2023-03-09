package Day1_application;

public class SampleEx101 {
    public static void main(String[] args) {
        SampleClassEx01 s1, s2;

        // インスタンスの数を取得
        System.out.println("インスタンス数：" + SampleClassEx01.getNumberOfInstance());

        // インスタンスを生成
        s1 = new SampleClassEx01(50); // コンストラクタ1の呼び出し
        s2 = new SampleClassEx01(); // コンストラクタ2の呼び出し

        // 値を取得して表示する
        System.out.println(s1.getValue());
        System.out.println(s2.getValue());

        // インスタンスの数を取得
        System.out.println("インスタンス数：" + SampleClassEx01.getNumberOfInstance());
    }
}
