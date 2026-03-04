public class PrintnumberNtoOne {

    static void f(int i, int n) {

        // Base Case
        if (i < 1) {
            return;
        }

        System.out.println(i);

        f(i - 1, n);
    }

    public static void main(String[] args) {

        int n = 3;   // You can change this value

        f(n, n);
    }
}