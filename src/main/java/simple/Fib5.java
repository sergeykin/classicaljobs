package simple;

import java.util.stream.IntStream;

public class Fib5 {

    private  int last = 0, next = 1;
    public IntStream stream(){
        return IntStream.generate(()->{
            int oldlast = last;
            last = next;
            next = oldlast + next;
            return oldlast;
        });
    }

    public static void main(String[] args) {
        Fib5 fib5 = new Fib5();
        fib5.stream().limit(20).forEachOrdered(System.out::println);
    }
}
