package simple;

public class Fib4 {
    public static int fib4(int n) {
        int last = 0, next = 1;
        for (int i = 0; i < n; i++) {
            int oldlast = last;
            last = next;
            next = oldlast + next;
        }
        return last;
    }

    public static void main(String[] args) {
        System.out.println(fib4(20));
    }
}
