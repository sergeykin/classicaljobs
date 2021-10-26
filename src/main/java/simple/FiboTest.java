package simple;

import java.util.HashMap;
import java.util.Map;

public class FiboTest {
    Map<Integer, Integer> existing = new HashMap<>(Map.of(1, 0, 2, 1));

    public int fibo(int n1) {
        if (existing.containsKey(n1)) {
            return existing.get(n1);
        } else {
            int temp = fibo(n1 - 1) + fibo(n1 - 2);
            existing.put(n1, temp);
            return existing.get(n1);
        }
    }

    public static void main(String[] args) {
        FiboTest fiboTest = new FiboTest();
        System.out.println(fiboTest.fibo(9));
    }
}
