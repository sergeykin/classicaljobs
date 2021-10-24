package simple;

public class FiboNumber {
    public static int fib(int number) {
        if (number <= 1) {
            return 0;
        }
        if (number == 2) {
            return 1;
        }
        return fib(number - 1) + fib(number - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(20));
        /*
        0, 1, 1, 2, 3, 5, 8, 13, 21...
Первое число в последовательности Фибоначчи — 0, четвертое — 2. Отсюда следует, что для получения значения любого числа n в последовательности Фибоначчи можно использовать формулу
fib(n) = fib(n — 1) + fib(n — 2)
1.1.1.
         */
    }
}
