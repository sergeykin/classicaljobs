package chapter3;

import java.util.List;
import java.util.Map;

//V - тип переменной, D - тип домена
public abstract class Constraint<V, D> {
    protected List<V> variables;

    public Constraint(List<V> variables) {
        this.variables = variables;
    }

    //необходимо переопределить в подклассах
    public abstract boolean satisfied(Map<V, D> assignment);

}
