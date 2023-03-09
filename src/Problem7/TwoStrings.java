package Problem7;

public class TwoStrings {
    // 一つ目の文字列
    private String str1;

    // 二つ目の文字列
    private String str2;

    private String ConnectStr;

    // 一つ目の文字列を設定
    public void setStr1(String str1) {
        this.str1 = str1;
    }

    // 二つ目の文字列を設定
    public void setStr2(String str2) {
        this.str2 = str2;
    }

    // 一つ目の文字列を取得
    public String getStr1() {
        return this.str1;
    }

    // 二つ目の文字列を取得
    public String getStr2() {
        return this.str2;
    }

    public String getConnectedString() {
        return this.str1 + this.str2;
    }
}
