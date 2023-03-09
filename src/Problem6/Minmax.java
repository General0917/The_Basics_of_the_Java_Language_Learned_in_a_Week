package Problem6;

public class Minmax {
    // 最大値の取得
    public int numMax(int n1, int n2, int n3) {
        int ans;

        ans = n1;

        if (ans < n2) {
            ans = n2;
        }

        if (ans < n3) {
            ans = n3;
        }

        return ans;
    }

    public int numMin(int n1, int n2, int n3) {
        int ans;

        ans = n1;

        if (ans > n2) {
            ans = n2;
        }

        if (ans > n3) {
            ans = n3;
        }

        return ans;
    }
}
