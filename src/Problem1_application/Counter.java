package Problem1_application;

public class Counter {
    private int count = 0;

    static int totalCount;

    public void reset() {
        count = 0;
    }

    public void count() {
        count++;
    }

    public int getCount() {
        return count;
    }

    static int getTotalCount(int a, int b) {
        totalCount = a + b;
        return totalCount;
    }
}
