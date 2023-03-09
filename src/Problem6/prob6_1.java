package Problem6;

public class prob6_1 {
    public static void main(String[] args) {
        Minmax m = new Minmax();

        int n1 = 4, n2 = 6, n3 = 5;
        System.out.println(n1 + "と" + n2 + "と" + n3 + "のうち、最大のものは" + m.numMax(n1, n2, n3));
        System.out.println(n1 + "と" + n2 + "と" + n3 + "のうち、最小のものは" + m.numMin(n1, n2, n3));
    }
}
